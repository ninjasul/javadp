package chap05.strategy._06.ex03;

public class Member {
    private String name;
    private long accAmount;

    public Member(String name, long accAmount) {
        this.name = name;
        this.accAmount = accAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccAmount() {
        return accAmount;
    }

    public void setAccAmount(int price) {
        this.accAmount += price;
    }
}