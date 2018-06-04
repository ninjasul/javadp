package chap05.strategy._06.ex03;

public interface PricePolicy {
    int calculate(int price, int bookCount );
}