package chap13.abstractfactory._03.ex01;

public interface NavigationFactory {
    GPS createGPS();
    Map createMap();
    Screen createScreen();
    PathFinder createPathFinder();
}