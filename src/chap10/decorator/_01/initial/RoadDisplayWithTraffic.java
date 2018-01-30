package chap10.decorator._01.initial;

// 기본 도로 + 교통량 표시 클래스
public class RoadDisplayWithTraffic extends RoadDisplay {
	public void draw() {
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic() {
		System.out.println("교통량 표시");
	}
}