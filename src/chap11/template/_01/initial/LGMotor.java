package chap11.template._01.initial;

public class LGMotor {

	private Door door;
	private MotorStatus motorStatus;
	
	public LGMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	private void moveLGMotor( Direction direction ) {
		System.out.println("Move lgMotor toward " + direction.toString());
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
		
		// 이 함수를 제외하고는 HyundaiMotor 와 동일함.
		// 너무 많은 중복코드를 가지고 있으므로 문제가 있음.
		moveLGMotor(direction);		
		setMotorStatus(MotorStatus.MOVING);
	}	
}
