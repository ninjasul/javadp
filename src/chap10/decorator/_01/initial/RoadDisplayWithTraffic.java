package chap10.decorator._01.initial;

// �⺻ ���� + ���뷮 ǥ�� Ŭ����
public class RoadDisplayWithTraffic extends RoadDisplay {
	public void draw() {
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic() {
		System.out.println("���뷮 ǥ��");
	}
}