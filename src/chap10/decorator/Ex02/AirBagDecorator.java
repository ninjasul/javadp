package chap10.decorator.Ex02;

public class AirBagDecorator extends CarOptionDecorator {
    public AirBagDecorator(CarComponent carComponent) {
        super(carComponent);
    }
    private int airBagPrice;

    public AirBagDecorator( CarComponent decoratedCar, int airBagPrice ) {
        super(decoratedCar);
        this.airBagPrice = airBagPrice;
    }

    @Override
    public int getPrice() {
        return carComponent.getPrice() + airBagPrice;
    }

    @Override
    public String getCarInfo() {
        return carComponent.getPrice() + " " + "에어백";
    }
}