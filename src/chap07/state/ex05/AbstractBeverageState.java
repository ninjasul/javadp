package chap07.state.ex05;

public abstract class AbstractBeverageState implements BeverageState {

    public abstract int buttonPressed(Beverage beverage, int depositedMoney);

    @Override
    public void beverageFilled(Beverage beverage, int cnt, int depositedMoney ) {
        beverage.setStockCnt(beverage.getStockCnt()+cnt);
        updateState(beverage, depositedMoney);
    }

    public void updateState( Beverage beverage, int depositedMoney ) {
        if( beverage.getStockCnt() > 0 ) {
            if( depositedMoney >= beverage.getPrice() ) {
                beverage.setState(OnSaleBeverageState.getInstance());
            }
            else {
                beverage.setState(NotEnoughMoneyBeverageState.getInstance());
            }
        }
        else {
            beverage.setState(SoldOutBeverageState.getInstance());
        }
    }
}