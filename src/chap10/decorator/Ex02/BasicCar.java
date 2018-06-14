package chap10.decorator.Ex02;

public class BasicCar implements CarComponent {

    private int price;

    public BasicCar( int price ) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getCarInfo() {
        return "기본 차량";
    }
}