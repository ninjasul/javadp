package chap10.decorator._02.resolved;

// 기본 도로 + 차선 표시 클래스
public class LaneDecorator extends DisplayDecorator {
	
	public LaneDecorator( Display decoratedDisplay ) {
		super(decoratedDisplay);
	}
	
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("\t차선 표시");
	}
}