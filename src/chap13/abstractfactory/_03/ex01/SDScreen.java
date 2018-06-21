package chap13.abstractfactory._03.ex01;

public class SDScreen implements Screen {

    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map " + map.getClass().getSimpleName() + " on SD screen");
    }
}