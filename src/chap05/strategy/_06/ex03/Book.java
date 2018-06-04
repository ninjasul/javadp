package chap05.strategy._06.ex03;

public class Book {
    private String name;
    private int publishedYear;
    private int price;

    public Book(String name, int publishedYear, int price) {
        this.name = name;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}