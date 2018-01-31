package chap11.template._02.resolved;

public class LGMotor extends Motor {

	private Door door;
	private MotorStatus motorStatus;
	
	public LGMotor(Door door) {
		super(door);
	}
	
	protected void moveMotor( Direction direction ) {
		System.out.println("Move lgMotor towards " + direction.toString());
		setMotorStatus(MotorStatus.STOPPED);
	}
}
