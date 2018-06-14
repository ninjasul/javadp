package chap10.decorator._02.resolved02;

public class CrossingDecorator extends DisplayDecorator {
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
        displayCrossing();
    }

    private void displayCrossing() {
        System.out.println("교차로 정보 표시");
    }
}