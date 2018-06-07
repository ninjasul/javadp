package chap07.state._01.ex05;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private static Map<String, Beverage> beverageMap = new HashMap();
    private static int money;

    public static void insertMoney( int price ) {
        money += price;
        System.out.println(money + " won" );

        for( Map.Entry<String, Beverage> entry : beverageMap.entrySet() ) {
            Beverage beverage = entry.getValue();
            beverage.getState().moneyInserted(beverage, money);
        }
    }

    public static void pressButton( String name ) {
        Beverage beverage = beverageMap.get(name);
        if( beverage != null ) {
            money = beverage.getState().buttonPressed(beverage, money);
        }
        else {
            System.out.println("There is no beverage whose name is " + name );
        }
    }

    public static void fillBeverage( String name, int price, int cnt ) {
        Beverage beverage = beverageMap.get(name);
        if( beverage != null ) {
            beverage.getState().beverageFilled(beverage, cnt);
        }
        else {
            Beverage newBeverage = new Beverage(name, price, 0);
            newBeverage.getState().beverageFilled(newBeverage, 2);
            beverageMap.put(name, newBeverage);
        }
    }

    public static void pullOutMoney() {

        if( money > 0 ) {
            System.out.println(money + " won was pulled out from the vending machine.");
            money = 0;
        }
        else {
            System.out.println("There is no money to pull out.");
        }
    }
}