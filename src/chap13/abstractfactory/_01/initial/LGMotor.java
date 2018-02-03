package chap13.abstractfactory._01.initial;

public class LGMotor extends Motor {
	
	public LGMotor() {
		super();
	}
	
	protected void moveMotor( Direction direction ) {
		System.out.println("Move lgMotor towards " + direction.toString());
		setMotorStatus(MotorStatus.STOPPED);
	}
}
