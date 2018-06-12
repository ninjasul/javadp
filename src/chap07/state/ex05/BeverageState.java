package chap07.state.ex05;

public interface BeverageState {
    int buttonPressed(Beverage beverage, int depositedMoney);
    void beverageFilled(Beverage beverage, int cnt, int depositedMoney);
}