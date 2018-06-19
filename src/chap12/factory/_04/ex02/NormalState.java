package chap12.factory._04.ex02;

import static chap12.factory._04.ex02.CarStateID.LIMP_MODE;

public class NormalState extends CarState {

    private NormalState(Car car) {
        super(car);
    }

    private static CarState state;

    public static CarState getInstance(Car car) {

        if( state == null ) {
            state = new NormalState(car);
        }

        return state;
    }

    public void speedUp( int targetSpeed ) {
        System.out.print("Speed: " + car.getSpeed());

        if( targetSpeed > car.getSpeed() ) {
            car.setSpeed(targetSpeed);
        }

        System.out.println(" ==> " + car.getSpeed() );
    }

    public void engineFailedDetected() {
        System.out.print("Speed: " + car.getSpeed());
        car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
        System.out.println(" ==> " + car.getSpeed() );
        car.setState(car.getLimpMode());
    }

    public void engineRepaired() {
        System.out.println("Unexpected Event");
    }

}