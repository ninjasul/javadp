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
		
		// 중복 코드는 abstract에서 최대한 구현하고 하위 클래스별로 다른 코드만 abstract 메소드로 구현
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
	
	protected abstract void moveMotor(Direction direction);
}
