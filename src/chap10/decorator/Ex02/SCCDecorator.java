package chap10.decorator.Ex02;

public class SCCDecorator extends CarOptionDecorator {
    public SCCDecorator(CarComponent carComponent) {
        super(carComponent);
    }
    private int sccPrice;

    public SCCDecorator(CarComponent decoratedCar, int sccPrice ) {
        super(decoratedCar);
        this.sccPrice = sccPrice;
    }

    @Override
    public int getPrice() {
        return carComponent.getPrice() + sccPrice;
    }

    @Override
    public String getCarInfo() {
        return carComponent.getCarInfo() + " " + "SCC";
    }
}