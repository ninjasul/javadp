package chap13.abstractfactory._03.ex01;

public class HDScreen implements Screen {

    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map " + map.getClass().getSimpleName() + " on HD screen");
    }
}