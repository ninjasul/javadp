package chap10.decorator._02.resolved;

// 기본 도로 + 차선 표시 클래스
public class CrossingDecorator extends DisplayDecorator {
	
	public CrossingDecorator( Display decoratedDisplay ) {
		super(decoratedDisplay);
	}
	
	public void draw() {
		super.draw();
		drawCrossing();
	}
	
	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}
}