package chap08.command._04_resolved;

public class Client {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);
        Button button = new Button(alarmOnCommand);
        button.pressed();

        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        button.setCommand(lampOnCommand);
        button.pressed();

        LampOffCommand lampOffCommand = new LampOffCommand(lamp);
        button.setCommand(new LampOffCommand(lamp));
        button.pressed();

        button.setCommand(alarmOnCommand);
        button.pressed();
    }
}