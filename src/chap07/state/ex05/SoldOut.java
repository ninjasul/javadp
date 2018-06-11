package chap07.state.ex05;

public class SoldOut extends AbstractState {
    private static SoldOut state = new SoldOut();
    private SoldOut() {}

    public static SoldOut getInstance() {
        return state;
    }

    @Override
    public int buttonPressed(Beverage beverage, int price) {
        System.out.println(beverage.getName() + " is sold out.");
        return price;
    }
}