package chap13.abstractfactory._03.ex01;

import com.sun.org.apache.xerces.internal.util.SAXLocatorWrapper;

public class BasicNavigationFactory implements NavigationFactory {
    private static NavigationFactory factory;
    private BasicNavigationFactory() {}

    public static NavigationFactory getInstance() {
        if( factory == null ) {
            factory = new BasicNavigationFactory();
        }

        return factory;
    }

    @Override
    public GPS createGPS() {
        return new CheapGPS();
    }

    @Override
    public Map createMap() {
        return new SmallMap();
    }

    @Override
    public Screen createScreen() {
        return new SDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new SlowPathFinder();
    }
}