package chap12.factory._04.ex02;

enum CarStateID {
    NORMAL, LIMP_MODE
}

public class CarStateFactory {
    public static CarState getState(CarStateID stateID, Car car) {
        switch( stateID ) {
            case NORMAL:
                return NormalState.getInstance(car);

            case LIMP_MODE:
                return LimpState.getInstance(car);

            default:
                return NormalState.getInstance(car);
        }
    }
}