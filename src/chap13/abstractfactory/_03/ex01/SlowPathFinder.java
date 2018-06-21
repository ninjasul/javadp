package chap13.abstractfactory._03.ex01;

public class SlowPathFinder implements  PathFinder {

    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Slow Path Finder");
        return null;
    }
}