package chap07.state.ex03;

public class On implements LightState{
    private static On state = new On();
    private On() {};

    public static On getInstance() {
        return state;
    }

    @Override
    public void onButtonClicked(Light light) {
        System.out.println("Sleeping Mode.");
        light.setState(Sleeping.getInstance());
    }

    @Override
    public void offButtonClicked(Light light) {
        System.out.println("Power Off.");
        light.setState(Off.getInstance());
    }
}