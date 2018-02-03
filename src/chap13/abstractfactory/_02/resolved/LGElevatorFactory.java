package chap13.abstractfactory._02.resolved;

public class LGElevatorFactory extends ElevatorFactory {

	private static ElevatorFactory factory;
	private LGElevatorFactory() {}
	
	public static ElevatorFactory getInstance() {
		if (factory == null )	{
			factory = new LGElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new LGDoor();
	}

}
