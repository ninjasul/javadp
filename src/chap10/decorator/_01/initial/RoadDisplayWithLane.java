package chap10.decorator._01.initial;

// 기본 도로 + 차선 표시 클래스
public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("차선 표시");
	}
}