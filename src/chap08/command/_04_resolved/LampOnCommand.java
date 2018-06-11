package chap08.command._04_resolved;

public class LampOnCommand implements Command {

    private Lamp theLamp;

    public LampOnCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        theLamp.turnOn();
    }
}