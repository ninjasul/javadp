package chap13.abstractfactory._02.resolved;

public class HyundaiElevatorFactory extends ElevatorFactory {

	private static ElevatorFactory factory;
	private HyundaiElevatorFactory() {}
	
	public static ElevatorFactory getInstance() {
		if (factory == null )	{
			factory = new HyundaiElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new HyundaiDoor();
	}

}
