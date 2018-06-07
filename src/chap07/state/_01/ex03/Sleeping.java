package chap07.state._01.ex03;

public class Sleeping implements LightState{
    private static Sleeping state = new Sleeping();
    private Sleeping() {};

    public static Sleeping getInstance() {
        return state;
    }

    @Override
    public void onButtonClicked(Light light) {
        System.out.println("Light On.");
        light.setState(On.getInstance());
    }

    @Override
    public void offButtonClicked(Light light) {
        System.out.println("Power Off.");
        light.setState(Off.getInstance());
    }
}