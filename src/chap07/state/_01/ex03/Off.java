package chap07.state._01.ex03;

public class Off implements LightState{
    private static Off state = new Off();
    private Off() {};

    public static Off getInstance() {
        return state;
    }

    @Override
    public void onButtonClicked(Light light) {
        System.out.println("Light On.");
        light.setState(On.getInstance());
    }

    @Override
    public void offButtonClicked(Light light) {
        System.out.println("No Change.");
    }
}