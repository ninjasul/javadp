package chap11.template._01.initial;

public class HyundaiMotor {

	private Door door;
	private MotorStatus motorStatus;
	
	public HyundaiMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	private void moveHyundaiMotor( Direction direction ) {
		System.out.println("Move hyundaiMotor toward " + direction.toString());
		setMotorStatus(MotorStatus.STOPPED);
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
		
		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}	
}
