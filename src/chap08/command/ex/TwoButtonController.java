package chap08.command.ex;

public class TwoButtonController {
    private Command command1;
    private Command command2;

    public TwoButtonController( Command command1, Command command2 ) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void setCommand( Command command1, Command command2 ) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void pressButton1() {
        this.command1.execute();
    }

    public void pressButton2() {
        this.command2.execute();
    }
}