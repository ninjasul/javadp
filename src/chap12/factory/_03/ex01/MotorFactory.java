package chap12.factory._03.ex01;

public class MotorFactory {
    public static Motor getMotor(MotorVendorID vendorID) {
        switch (vendorID) {
            case LG:
                return LGMotor.getInstance();

            case HYUNDAI:
                return HyundaiMotor.getInstance();

            default:
                return LGMotor.getInstance();
        }
    }
}