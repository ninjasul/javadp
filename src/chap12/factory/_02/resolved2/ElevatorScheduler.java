package chap12.factory._02.resolved2;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}