package chap13.abstractfactory._02.resolved;

public class SamsungElevatorFactory extends ElevatorFactory {
	
	private static ElevatorFactory factory;
	private SamsungElevatorFactory() {}
	
	public static ElevatorFactory getInstance() {
		if (factory == null )	{
			factory = new SamsungElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new SamsungMotor();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new SamsungDoor();
	}

}
