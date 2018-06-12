package chap07.state.ex05;

public class SoldOutBeverageState extends AbstractBeverageState {
    private static SoldOutBeverageState state = new SoldOutBeverageState();
    private SoldOutBeverageState() {}

    public static SoldOutBeverageState getInstance() {
        return state;
    }

    @Override
    public int buttonPressed(Beverage beverage, int depositedMoney) {
        System.out.println(beverage.getName() + " is sold out.");
        return depositedMoney;
    }
}