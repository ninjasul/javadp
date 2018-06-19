package chap12.factory._03.ex01;

public class LGMotor extends Motor {

    private static Motor motor;
    private LGMotor() {}

    public static Motor getInstance() {
        if( motor == null ) {
            motor = new LGMotor();
        }
        return motor;
    }

    protected void moveMotor (Direction direction ) {
        System.out.println("move LG Motor " + direction);
    }
}