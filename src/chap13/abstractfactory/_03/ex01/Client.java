package chap13.abstractfactory._03.ex01;

import java.util.Scanner;

enum NavigationType {
    BASIC, PREMIUM;

    public static NavigationType getType( String type ) {

        for( NavigationType t : NavigationType.values() ) {
            if( t.name().equalsIgnoreCase(type) ) {
                return t;
            }
        }

        return BASIC;
    }
}

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        while( !(input = sc.nextLine()).equals("0") ) {
            NavigationFactory factory = NavigationFactoryBuilder.getFactory(NavigationType.getType(input));
            GPS gps = factory.createGPS();
            Screen mapScreen = factory.createScreen();
            PathFinder pathFinder = factory.createPathFinder();
            Map map = factory.createMap();

            Location l1 = gps.findCurrentLocation();
            Location l2 = gps.findCurrentLocation();

            pathFinder.findPath( l1, l2 );
        }
    }
}