package chap13.abstractfactory._03.ex01;

public class FastPathFinder implements PathFinder {

    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Fast Path Finder");
        return null;
    }
}