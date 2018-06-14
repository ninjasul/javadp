package chap10.decorator.Ex02;

public class NaviDecorator extends CarOptionDecorator {
    public NaviDecorator(CarComponent carComponent) {
        super(carComponent);
    }
    private int naviPrice;

    public NaviDecorator(CarComponent decoratedCar, int naviPrice ) {
        super(decoratedCar);
        this.naviPrice = naviPrice;
    }

    @Override
    public int getPrice() {
        return carComponent.getPrice() + naviPrice;
    }

    @Override
    public String getCarInfo() {
        return carComponent.getCarInfo() + " " + "네이게이션";
    }
}