package chap07.state._01.ex05;

public class Client {
    public static void main(String[] args) {
        //VendingMachine vm = new VendingMachine();
        VendingMachine.fillBeverage("Cola", 1000, 5 );
        VendingMachine.fillBeverage("Soda", 800, 2 );
        VendingMachine.fillBeverage("Juice", 1500, 3 );

        VendingMachine.insertMoney(1000);
        VendingMachine.pressButton("Soda");
        VendingMachine.pressButton("Cola");
        VendingMachine.pressButton("Juice");

        VendingMachine.insertMoney(5000);
        VendingMachine.pressButton("Soda");
        VendingMachine.pressButton("Soda");
        VendingMachine.pressButton("Soda");

        VendingMachine.pullOutMoney();
        VendingMachine.pullOutMoney();
        VendingMachine.pressButton("Cola");
        VendingMachine.pressButton("Juice");
    }
}