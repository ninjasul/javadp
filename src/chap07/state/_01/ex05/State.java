package chap07.state._01.ex05;

import java.util.ArrayList;

public interface State {
    void moneyInserted(Beverage beverage, int price);
    int buttonPressed(Beverage beverage, int price);
    void beverageFilled(Beverage beverage, int cnt);
}