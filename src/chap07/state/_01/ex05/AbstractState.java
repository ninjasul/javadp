package chap07.state._01.ex05;

import java.util.ArrayList;

public abstract class AbstractState {
    void moneyInserted(Beverage beverage, int price) {
        if( price >= beverage.getPrice() ) {
            beverage.setState(OnSale.getInstance());
        }
    }

    public abstract int buttonPressed(Beverage beverage, int price);

    public void beverageFilled(Beverage beverage, int cnt) {
        beverage.setStockCnt(beverage.getStockCnt()+cnt);

        if( beverage.getStockCnt() > 0 ) {
            beverage.setState(OnSale.getInstance());
        }
    }
}