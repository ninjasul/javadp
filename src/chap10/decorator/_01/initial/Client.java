package chap10.decorator._01.initial;

public class Client {
	public static void main (String[] args ) {
		RoadDisplay road = new RoadDisplay();
		road.draw();	// �⺻ ���θ� ǥ��
		
		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();	// �⺻ ���� + ���� ǥ��
		
		RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
		roadWithTraffic.draw();	// �⺻ ���� + ���뷮 ǥ��
		
		// �߰� �Ǵ� ����� ���պ��� ���� Ŭ������ �����ؾ� �ϴ� �������� ����.
	}
}
