package chap12.factory._04.ex02;

import static chap12.factory._04.ex02.CarStateID.NORMAL;

public class LimpState extends CarState {
    public static final int LIMP_MODE_MAX_SPEED = 60;

    private static CarState state;

    private LimpState(Car car) {
        super(car);
    }

    public static CarState getInstance(Car car) {
        if( state == null ) {
            state = new LimpState(car);
        }
        return state;
    }

    @Override
    public void speedUp(int targetSpeed) {
        System.out.print("Speed: " + car.getSpeed());

        if( targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED ) {
            car.setSpeed(targetSpeed);
        }

        System.out.println(" ==> " + car.getSpeed() );
    }

    public void engineFailedDetected() {
    }

    public void engineRepaired() {
        car.setState(car.getNormalMode());
    }
}