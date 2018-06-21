package chap13.abstractfactory._03.ex01;

public class PremiumNavigationFactory implements NavigationFactory {
    private static NavigationFactory factory;
    private PremiumNavigationFactory() {}

    public static NavigationFactory getInstance() {
        if( factory == null ) {
            factory = new PremiumNavigationFactory();
        }

        return factory;
    }

    @Override
    public GPS createGPS() {
        return new ExpensiveGPS();
    }

    @Override
    public Map createMap() {
        return new LargeMap();
    }

    @Override
    public Screen createScreen() {
        return new HDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new FastPathFinder();
    }
}