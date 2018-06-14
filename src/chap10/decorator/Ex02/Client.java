package chap10.decorator.Ex02;

public class Client {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar( 3000 );
        System.out.println(basicCar.getPrice());
        System.out.println(basicCar.getCarInfo());

        CarOptionDecorator airBagDecorator = new AirBagDecorator( new BasicCar( 3000 ), 100 );
        System.out.println(airBagDecorator.getPrice());
        System.out.println(airBagDecorator.getCarInfo());

        CarOptionDecorator naviAirbagDecorator = new NaviDecorator( new AirBagDecorator( new BasicCar( 3000 ), 100 ), 30 );
        System.out.println(naviAirbagDecorator.getPrice());
        System.out.println(naviAirbagDecorator.getCarInfo());


        CarOptionDecorator allDecorator = new ESCDecorator(new SCCDecorator(new NaviDecorator( new AirBagDecorator( new BasicCar( 3000 ), 100 ), 30 ), 50 ), 70);
        System.out.println(allDecorator.getPrice());
        System.out.println(allDecorator.getCarInfo());
    }
}