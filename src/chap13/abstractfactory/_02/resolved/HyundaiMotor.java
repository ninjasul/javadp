package chap13.abstractfactory._02.resolved;

public class HyundaiMotor extends Motor{
	
	public HyundaiMotor() {
		super();
	}
	
	
	protected void moveMotor( Direction direction ) {
		System.out.println("Move hyundaiMotor towards " + direction.toString());
		setMotorStatus(MotorStatus.STOPPED);
	}	
}
