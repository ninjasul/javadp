package chap13.abstractfactory._02.resolved;

public abstract class Door {
	private DoorStatus doorStatus;
	
	public Door() {
		doorStatus = DoorStatus.CLOSED;
	}
	
	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	public void close() {
		if( doorStatus == DoorStatus.CLOSED ) {
			return;
		}
		
		doClose();						// 하위 클래스에서 오버라이드 하는 추상 메서드
		doorStatus = DoorStatus.CLOSED;
	}
	
	protected abstract void doClose();
	
	public void open() {
		if( doorStatus == DoorStatus.OPENED ) {
			return;
		}
		
		doOpen();						// 하위 클래스에서 오버라이드 하는 추상 메서드
		doorStatus = DoorStatus.OPENED;
	}
	
	protected abstract void doOpen();
}


