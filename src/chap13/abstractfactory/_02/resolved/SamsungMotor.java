package chap13.abstractfactory._02.resolved;

public class SamsungMotor extends Motor {
	
	public SamsungMotor() {
		super();
	}
	
	protected void moveMotor( Direction direction ) {
		System.out.println("Move SamsungMotor towards " + direction.toString());
		setMotorStatus(MotorStatus.STOPPED);
	}
}
