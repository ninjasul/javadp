package chap13.abstractfactory._02.resolved;

public abstract class Motor {
	protected Door door;
	private MotorStatus motorStatus;

	public Motor() {
		motorStatus = MotorStatus.STOPPED;
	}
	
	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	public void setDoor( Door door ) {
		this.door = door;
	}
	
	public MotorStatus getMotorStatus() {
		return motorStatus;		
	}

	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if( motorStatus == MotorStatus.MOVING ) {
			return;
		}
		
		DoorStatus doorStatus = door.getDoorStatus();
		if( doorStatus == DoorStatus.OPENED ) {
			door.close();
		}
		
		// �ߺ� �ڵ�� abstract���� �ִ��� �����ϰ� ���� Ŭ�������� �ٸ� �ڵ常 abstract �޼ҵ�� ����
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
	
	protected abstract void moveMotor(Direction direction);
}
