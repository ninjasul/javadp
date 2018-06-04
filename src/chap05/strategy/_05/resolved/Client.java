package chap05.strategy._05.resolved;

public class Client {
    public static void main(String[] args) {
        Robot atom = new Robot("Atom", new FlyMoveStrategy(), new PunchAttackStrategy());
        Robot taekwonV = new Robot("TaekwonV", new WalkMoveStrategy(), new MissleAttackStrategy());
        Robot vanguard = new Robot("VAnguard", new FlyMoveStrategy(), new MissleAttackStrategy());

        atom.move();
        atom.attack();

        taekwonV.move();
        taekwonV.attack();

        vanguard.move();
        vanguard.attack();
    }
}