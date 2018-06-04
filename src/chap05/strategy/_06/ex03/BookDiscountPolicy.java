package chap05.strategy._06.ex03;

public class BookDiscountPolicy implements PricePolicy {
    @Override
    public int calculate(int price, int bookCount) {
        return (int)(price * bookCount * 0.8);
    }
}