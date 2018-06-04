package chap05.strategy._05.resolved;

public class PunchAttackStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attacked by punch!!");
    }
}