package chap13.abstractfactory._02.resolved;

public class ElevatorFactoryFactory {

	public static ElevatorFactory getFactory(VendorID vendorID) {
			
		ElevatorFactory factory = null;
		
		switch(vendorID) {
		case LG:
			factory = LGElevatorFactory.getInstance();
			break;
			
		case HYUNDAI:
			factory = HyundaiElevatorFactory.getInstance();
			break;
			
		case SAMSUNG:
			factory = SamsungElevatorFactory.getInstance();
			break;
		}
		
		return factory;
	}
}
