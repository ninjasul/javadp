package chap07.state._01.ex05;

import java.util.ArrayList;

public class OnSale extends AbstractState {
    private static OnSale state = new OnSale();
    private OnSale() {}

    public static OnSale getInstance() {
        return state;
    }

    @Override
    public int buttonPressed(Beverage beverage, int price) {
        int result = price;

        if( price >= beverage.getPrice() ) {
            if( beverage.getStockCnt() > 0 ) {
                System.out.println(beverage.getName() + " is popped out.");
                result = price - beverage.getPrice();
                beverage.setStockCnt(beverage.getStockCnt()-1);
            }

            if( beverage.getStockCnt() <= 0 ) {
                beverage.setState(SoldOut.getInstance());
            }
        }
        else {
            System.out.println(price + " won is not enough to buy " + beverage.getName() );
        }


        return result;
    }
}