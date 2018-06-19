package chap12.factory._03.ex01;

public class ElevatorController {
    private int id;
    private int curFloor = 1;
    private Motor motor;

    public ElevatorController(int id , Motor motor ) {
        this.id = id;
        this.motor = motor;
    }

    public void gotoFloor(int destination ) {
        if (destination == curFloor)
            return;

        motor.move( (destination > curFloor) ? Direction.UP : Direction.DOWN );

        System.out.print("Elevator [" + id + "] Floor: " + curFloor);
        curFloor = destination;
        System.out.println(" ==> " + curFloor + " with " + motor.getClass().getSimpleName()) ;

        motor.stop() ;
    }
}
