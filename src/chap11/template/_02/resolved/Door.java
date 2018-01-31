package chap11.template._02.resolved;

public class Door {

	private DoorStatus doorStatus;
	
	public Door() {
		doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	public void close() {
		doorStatus = DoorStatus.CLOSED;
	}
	
	public void opened() {
		doorStatus = DoorStatus.OPENED;
	}
}
