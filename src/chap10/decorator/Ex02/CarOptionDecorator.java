package chap10.decorator.Ex02;

public abstract class CarOptionDecorator implements CarComponent {

    protected CarComponent carComponent;

    public CarOptionDecorator( CarComponent carComponent ) {
        this.carComponent = carComponent;
    }

    public abstract int getPrice();
    public abstract String getCarInfo();

}