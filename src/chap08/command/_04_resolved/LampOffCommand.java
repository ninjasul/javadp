package chap08.command._04_resolved;

public class LampOffCommand implements Command {

    private Lamp theLamp;

    public LampOffCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        theLamp.turnOff();
    }
}