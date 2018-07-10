package chap12.factory._02.resolved2;

public class ThroughputScheduler  implements ElevatorScheduler{

    private ThroughputScheduler() {}
    private static ThroughputScheduler scheduler;

    public static ElevatorScheduler getInstance() {
        if( scheduler == null ) {
            scheduler = new ThroughputScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}