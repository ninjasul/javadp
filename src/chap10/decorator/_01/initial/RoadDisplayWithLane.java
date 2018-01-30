package chap10.decorator._01.initial;

// �⺻ ���� + ���� ǥ�� Ŭ����
public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("���� ǥ��");
	}
}