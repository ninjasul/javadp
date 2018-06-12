package chap07.state.ex05;

public class NotEnoughMoneyBeverageState extends AbstractBeverageState {
    private static NotEnoughMoneyBeverageState state = new NotEnoughMoneyBeverageState();
    private NotEnoughMoneyBeverageState() {}

    public static NotEnoughMoneyBeverageState getInstance() {
        return state;
    }

    @Override
    public int buttonPressed(Beverage beverage, int depositedMoney) {
        System.out.println(depositedMoney + " won is not enough to buy " + beverage.getName() );
        return depositedMoney;
    }
}