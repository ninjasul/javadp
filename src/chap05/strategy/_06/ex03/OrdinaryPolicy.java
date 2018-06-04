package chap05.strategy._06.ex03;

public class OrdinaryPolicy implements PricePolicy {
    @Override
    public int calculate(int price, int bookCount) {
        return price * bookCount;
    }
}