package chap13.abstractfactory._03.ex01;

public class CheapGPS implements GPS {

    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Cheap GPS");
        return null;
    }
}