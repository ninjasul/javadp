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
		
		doClose();						// ���� Ŭ�������� �������̵� �ϴ� �߻� �޼���
		doorStatus = DoorStatus.CLOSED;
	}
	
	protected abstract void doClose();
	
	public void open() {
		if( doorStatus == DoorStatus.OPENED ) {
			return;
		}
		
		doOpen();						// ���� Ŭ�������� �������̵� �ϴ� �߻� �޼���
		doorStatus = DoorStatus.OPENED;
	}
	
	protected abstract void doOpen();
}


