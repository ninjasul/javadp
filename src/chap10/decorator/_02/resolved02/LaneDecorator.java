package chap10.decorator._02.resolved02;

public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
        displayLane();
    }

    private void displayLane() {
        System.out.println("차선 표시");
    }
}