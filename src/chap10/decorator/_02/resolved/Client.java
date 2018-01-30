package chap10.decorator._02.resolved;

public class Client {
	public static void main (String[] args ) {
		Display road = new RoadDisplay();
		road.draw();	// �⺻ ���θ� ǥ��
		
		// ��� Display Ŭ������ ���� ����
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();	// �⺻ ���� + ���� ǥ��
		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();	// �⺻ ���� + ���뷮 ǥ��
		
		// �پ��� �ΰ� ����� ���� �ܰ迡�� ������ �� ����.
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();
		
		// �⺻���� + ������ + ���뷮 + ���� ���� ǥ�� 
		Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
		roadWithCrossingAndLaneAndTraffic.draw();
	}
}
