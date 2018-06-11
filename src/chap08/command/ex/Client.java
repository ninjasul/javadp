package chap08.command.ex;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        PowerCommand powerCommand = new PowerCommand(tv);
        MuteCommand muteCommand = new MuteCommand(tv);

        TwoButtonController controller = new TwoButtonController( muteCommand, powerCommand );
        controller.pressButton1();
        controller.pressButton2();
        controller.pressButton1();
        controller.pressButton1();
        controller.pressButton2();
        controller.pressButton1();
    }
}