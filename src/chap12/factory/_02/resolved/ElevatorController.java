package chap12.factory._02.resolved;

public class ElevatorController {
	private int id;
	private int curFloor; // ���� ��
	
	public ElevatorController(int id) {		
		this.id = id;
		this.curFloor = 1;
	}
	
	// ������ ������ �̵�
	public void gotoFloor( int destination ) {
		System.out.print("Elevator [" + id + "] Floor: " + curFloor);
		
		// ���� �� ����, �� �־��� ������ ��(destination)���� ���������Ͱ� �̵���.
		curFloor = destination;
		System.out.println(" ==> " + curFloor );
	}
	
}
