package chap10.decorator._01.initial;

public class Client {
	public static void main (String[] args ) {
		RoadDisplay road = new RoadDisplay();
		road.draw();	// 기본 도로만 표시
		
		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();	// 기본 도로 + 차선 표시
		
		RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
		roadWithTraffic.draw();	// 기본 도로 + 교통량 표시
		
		// 추가 되는 기능의 조합별로 하위 클래스를 생성해야 하는 문제점이 있음.
	}
}
