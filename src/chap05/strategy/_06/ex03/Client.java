package chap05.strategy._06.ex03;

public class Client {
    public static void main(String[] args) {
        Book book1 = new Book("서적 1", 2000, 8000 );
        Book book2 = new Book("서적 2", 2017, 15000 );
        Book book3 = new Book("서적 3", 2011, 20000 );
        Book book4 = new Book("서적 4", 1997, 7500 );

        Member member1 = new Member("고객 1", 0 );

        Rental rental1 = new Rental( member1, book1, 2, new BookDiscountPolicy() );
        Rental rental2 = new Rental( member1, book2, 1, new MemberDiscountPolicy() );
        Rental rental3 = new Rental( member1, book3, 5, new OrdinaryPolicy() );
        Rental rental4 = new Rental( member1, book4, 3, new OrdinaryPolicy() );

        System.out.println(rental1.getPrice());
        System.out.println(rental2.getPrice());
        System.out.println(rental3.getPrice());
        System.out.println(rental4.getPrice());
    }
}