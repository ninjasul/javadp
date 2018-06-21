package chap13.abstractfactory._03.ex01;

public class ExpensiveGPS implements GPS {

    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Expensive GPS");
        return null;
    }
}