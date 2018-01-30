package chap10.decorator._02.resolved;

public abstract class DisplayDecorator extends Display {
	private Display decoratedDisplay;
	
	public DisplayDecorator( Display decoratedDisplay ) {
		this.decoratedDisplay = decoratedDisplay;
	}
	
	public void draw() {
		decoratedDisplay.draw();
	}
}
