package chap12.factory._02.resolved2;

import java.util.ArrayList;
import java.util.List;

enum Direction {
    UP, DOWN;
}

enum SchedulingStrategyID {
    THROUGHPUT, RESPONSE_TIME, DYNAMIC;
}

public class ElevatorManager {
    List<ElevatorController> controllers;
    ElevatorScheduler scheduler;

    public ElevatorManager( int controllerCnt, SchedulingStrategyID strategyId ) {
        controllers = new ArrayList<ElevatorController>(controllerCnt);

        for( int i = 0; i < controllerCnt; ++i ) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }

        this.scheduler = SchedulerFactory.getScheduler(strategyId);
    }

    public void requestElevator( int destination, Direction direction ) {
        controllers.get(scheduler.selectElevator( this, destination, direction )).gotoFloor(destination);
    }
}