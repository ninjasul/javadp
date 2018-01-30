package chap10.decorator._02.resolved;

// 기본 도로 + 교통량 표시 클래스
public class TrafficDecorator extends DisplayDecorator {
	
	public TrafficDecorator( Display decoratedDisplay ) {
		super(decoratedDisplay);
	}
	
	public void draw() {
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}