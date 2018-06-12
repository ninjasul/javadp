package chap07.state.ex05;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private static Map<String, Beverage> beverageMap = new HashMap();
    private static int depositedMoney;

    public static void insertMoney( int amount ) {
        depositedMoney += amount;
        System.out.println(depositedMoney + " won" );
        updateStates();
    }

    public static void pressButton( String name ) {
        Beverage beverage = beverageMap.get(name);
        if( beverage != null ) {
            depositedMoney = beverage.getState().buttonPressed(beverage, depositedMoney);
            updateStates();
        }
        else {
            System.out.println("There is no '" + name + "' beverage.");
        }
    }

    public static void fillBeverage( String name, int beveragePrice, int cnt ) {
        Beverage beverage = beverageMap.get(name);
        if( beverage != null ) {
            beverage.getState().beverageFilled(beverage, cnt, depositedMoney);
        }
        else {
            Beverage newBeverage = new Beverage(name, beveragePrice, 0);
            newBeverage.getState().beverageFilled(newBeverage, 2, depositedMoney);
            beverageMap.put(name, newBeverage);
        }
    }

    public static void pullOutMoney() {

        if( depositedMoney > 0 ) {
            System.out.println(depositedMoney + " won was pulled out from the vending machine.");
            depositedMoney = 0;
            updateStates();
        }
        else {
            System.out.println("There is no money to pull out.");
        }
    }

    public static void updateStates() {
        for( Map.Entry<String, Beverage> entry : beverageMap.entrySet() ) {
            Beverage beverage = entry.getValue();
            beverage.getState().updateState(beverage, depositedMoney);
        }
    }
}