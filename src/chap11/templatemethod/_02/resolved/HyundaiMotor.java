package chap11.templatemethod._02.resolved;

public class HyundaiMotor extends Motor{

	private Door door;
	private MotorStatus motorStatus;
	
	public HyundaiMotor(Door door) {
		super(door);
	}

	protected void moveMotor( Direction direction ) {
		System.out.println("Move hyundaiMotor towards " + direction.toString());
		setMotorStatus(MotorStatus.STOPPED);
	}	
}
