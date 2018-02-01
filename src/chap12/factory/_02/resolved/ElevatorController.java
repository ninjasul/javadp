package chap12.factory._02.resolved;

public class ElevatorController {
	private int id;
	private int curFloor; // 현재 층
	
	public ElevatorController(int id) {		
		this.id = id;
		this.curFloor = 1;
	}
	
	// 지정한 층으로 이동
	public void gotoFloor( int destination ) {
		System.out.print("Elevator [" + id + "] Floor: " + curFloor);
		
		// 현재 층 갱신, 즉 주어진 목적지 층(destination)으로 엘리베이터가 이동함.
		curFloor = destination;
		System.out.println(" ==> " + curFloor );
	}
	
}
