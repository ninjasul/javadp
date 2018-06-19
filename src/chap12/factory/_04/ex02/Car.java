package chap12.factory._04.ex02;

import static chap12.factory._04.ex02.CarStateID.LIMP_MODE;
import static chap12.factory._04.ex02.CarStateID.NORMAL;

public class Car {
    private int speed;
    private CarState curState;

    public Car() {
        curState = NormalState.getInstance(this);
    }

    public void setState(CarState state) {
        this.curState = state;
    }

    public void speedDown( int targetSpeed ) {
        curState.speedDown(targetSpeed);
    }

    public void engineFailedDetected() {
        curState.engineFailedDetected();
    }

    public void speedUp(int targetSpeed) {
        curState.speedUp(targetSpeed);
    }

    public void engineRepaired() {
        curState.engineRepaired();
    }

    public CarState getNormalMode() {
        return CarStateFactory.getState(NORMAL, this);
    }

    public CarState getLimpMode() {
        return CarStateFactory.getState(LIMP_MODE, this);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed( int speed ) {
        this.speed = speed;
    }
}