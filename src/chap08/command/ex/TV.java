package chap08.command.ex;

public class TV {

    private boolean isPowerOn;
    private boolean isMuteOn;


    public void power() {
        if( isPowerOn ) {
            System.out.println("Power Off!");
        }
        else {
            System.out.println("Power On!");
        }

        isPowerOn = !isPowerOn;
    }

    public void mute() {
        if( isMuteOn ) {
            System.out.println("Mute Off");
        }
        else {
            System.out.println("Mute On!");
        }

        isMuteOn = !isMuteOn;
    }
}