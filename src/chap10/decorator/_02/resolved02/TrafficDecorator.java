package chap10.decorator._02.resolved02;

public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
        displayTraffic();
    }

    private void displayTraffic() {
        System.out.println("교통량 표시");
    }
}