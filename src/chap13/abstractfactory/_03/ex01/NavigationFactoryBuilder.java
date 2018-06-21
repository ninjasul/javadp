package chap13.abstractfactory._03.ex01;

public class NavigationFactoryBuilder {
    public static NavigationFactory getFactory(NavigationType type) {
        switch( type ) {
            case PREMIUM:
                return PremiumNavigationFactory.getInstance();

            case BASIC:
            default:
                return BasicNavigationFactory.getInstance();
        }
    }
}