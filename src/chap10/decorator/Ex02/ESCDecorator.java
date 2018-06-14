package chap10.decorator.Ex02;

public class ESCDecorator extends CarOptionDecorator {
    public ESCDecorator(CarComponent carComponent) {
        super(carComponent);
    }
    private int escPrice;

    public ESCDecorator(CarComponent decoratedCar, int escPrice ) {
        super(decoratedCar);
        this.escPrice = escPrice;
    }

    @Override
    public int getPrice() {
        return carComponent.getPrice() + escPrice;
    }

    @Override
    public String getCarInfo() {
        return carComponent.getCarInfo() + " " + "ESC";
    }
}