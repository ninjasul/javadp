package chap12.factory._03.ex01;

public class HyundaiMotor extends Motor {

    private static Motor motor;
    private HyundaiMotor() {}

    public static Motor getInstance() {
        if( motor == null ) {
            motor = new HyundaiMotor();
        }
        return motor;
    }

    protected void moveMotor (Direction direction ) {
        System.out.println("move Hyundai Motor " + direction);
    }
}