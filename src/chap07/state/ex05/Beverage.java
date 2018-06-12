package chap07.state.ex05;

public class Beverage {
    private String name;
    private int price;
    private int stockCnt;
    private AbstractBeverageState state;

    public Beverage(String name, int price, int stockCnt) {
        this.name = name;
        this.price = price;
        this.stockCnt = stockCnt;
        this.state = SoldOutBeverageState.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockCnt() {
        return stockCnt;
    }

    public void setStockCnt(int stockCnt) {
        this.stockCnt = stockCnt;
    }

    public AbstractBeverageState getState() {
        return state;
    }

    public void setState(AbstractBeverageState state) {
        this.state = state;
    }
}