package chap07.state.ex05;

public interface State {
    void moneyInserted(Beverage beverage, int price);
    int buttonPressed(Beverage beverage, int price);
    void beverageFilled(Beverage beverage, int cnt);
}