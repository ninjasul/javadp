package chap11.templatemethod._01.initial;

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
