package chap13.abstractfactory._01.initial;

import java.util.Calendar;

public class MotorFactory {
	public static Motor createMotor( VendorID vendorID ) {
		Motor motor = null;
		
		switch( vendorID ) {
		case LG:
			motor = new LGMotor();
			break;
			
		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		
		return motor;
	}
}
