package chap12.factory._02.resolved2;

import java.util.Calendar;

public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        switch( strategyID ) {
            case THROUGHPUT:
                return ThroughputScheduler.getInstance();

            case RESPONSE_TIME:
                return ResponseTimeScheduler.getInstance();

            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR);

                if( hour < 12 ) {
                    return ThroughputScheduler.getInstance();
                }
                else {
                    return ResponseTimeScheduler.getInstance();
                }

            default:
                return ThroughputScheduler.getInstance();
        }

    }
}