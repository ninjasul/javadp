package chap05.strategy._05.resolved;

public class WalkMoveStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moved by walking!!");
    }
}