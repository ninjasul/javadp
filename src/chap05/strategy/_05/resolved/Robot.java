package chap05.strategy._05.resolved;

public class Robot {

    private String name;
    private MoveStrategy moveStrategy;
    private AttackStrategy attackStrategy;

    public Robot(String name, MoveStrategy moveStrategy, AttackStrategy attackStrategy) {
        this.name = name;
        this.moveStrategy = moveStrategy;
        this.attackStrategy = attackStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void move() {
        moveStrategy.move();
    }

    public void attack() {
        attackStrategy.attack();
    }
}