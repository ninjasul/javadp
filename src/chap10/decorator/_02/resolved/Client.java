package chap10.decorator._02.resolved;

public class Client {
	public static void main (String[] args ) {
		Display road = new RoadDisplay();
		road.draw();	// 기본 도로만 표시
		
		// 모두 Display 클래스를 통해 접근
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();	// 기본 도로 + 차선 표시
		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();	// 기본 도로 + 교통량 표시
		
		// 다양한 부가 기능을 생성 단계에서 지정할 수 있음.
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();
		
		// 기본도로 + 교차로 + 교통량 + 차선 정보 표시 
		Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
		roadWithCrossingAndLaneAndTraffic.draw();
	}
}
