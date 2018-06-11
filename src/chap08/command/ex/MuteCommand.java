package chap08.command.ex;

public class MuteCommand implements Command {
    private TV tv;

    public MuteCommand(TV tv ) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.mute();
    }
}