package chap10.decorator._02.resolved;

// �⺻ ���� + ���� ǥ�� Ŭ����
public class LaneDecorator extends DisplayDecorator {
	
	public LaneDecorator( Display decoratedDisplay ) {
		super(decoratedDisplay);
	}
	
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("\t���� ǥ��");
	}
}