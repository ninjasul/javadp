package chap12.factory._02.resolved2;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private ResponseTimeScheduler() {}
    private static ResponseTimeScheduler scheduler;

    public static ElevatorScheduler getInstance() {
        if( scheduler == null ) {
            scheduler = new ResponseTimeScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 1;
    }
}