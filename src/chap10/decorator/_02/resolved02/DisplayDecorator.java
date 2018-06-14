package chap10.decorator._02.resolved02;

public abstract class DisplayDecorator implements Display {

    protected Display decoratedDisplay;

    public DisplayDecorator( Display decoratedDisplay ) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}