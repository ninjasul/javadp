package chap07.state.ex05;

public class OnSaleBeverageState extends AbstractBeverageState {
    private static OnSaleBeverageState state = new OnSaleBeverageState();
    private OnSaleBeverageState() {}

    public static OnSaleBeverageState getInstance() {
        return state;
    }

    @Override
    public int buttonPressed(Beverage beverage, int depositedMoney) {
        System.out.println(beverage.getName() + " is popped out.");
        depositedMoney = depositedMoney - beverage.getPrice();
        beverage.setStockCnt(beverage.getStockCnt()-1);
        //updateState( beverage, depositedMoney );
        return depositedMoney;
    }
}