package chap05.strategy._06.ex03;

public class Rental {
    private Member member;
    private Book book;
    private int numberOfBooks;
    private PricePolicy pricePolicy;

    public Rental(Member member, Book book, int numberOfBooks, PricePolicy pricePolicy) {
        this.member = member;
        this.book = book;
        this.numberOfBooks = numberOfBooks;
        this.pricePolicy = pricePolicy;
        this.member.setAccAmount(pricePolicy.calculate(book.getPrice(), numberOfBooks));
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public PricePolicy getPricePolicy() {
        return pricePolicy;
    }

    public void setPricePolicy(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public int getPrice() {
        return getPricePolicy().calculate(book.getPrice(), numberOfBooks );
    }
}