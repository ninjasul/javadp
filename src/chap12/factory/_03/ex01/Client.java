package chap12.factory._03.ex01;

import static chap12.factory._03.ex01.MotorVendorID.HYUNDAI;
import static chap12.factory._03.ex01.MotorVendorID.LG;

enum MotorVendorID {
    LG, HYUNDAI
}

public class Client {
    public static void main (String[] args ) {
        ElevatorController controller1 = new ElevatorController(1, MotorFactory.getMotor(LG));
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        ElevatorController controller2 = new ElevatorController(1, MotorFactory.getMotor(HYUNDAI));
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}