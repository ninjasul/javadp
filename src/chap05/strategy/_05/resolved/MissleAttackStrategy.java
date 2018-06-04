package chap05.strategy._05.resolved;

public class MissleAttackStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attacked by missles!!");
    }
}