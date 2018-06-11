package chap07.state.ex03;

public class Light {
    private LightState state;

    public Light() {
        this.state = Off.getInstance();
    }

    public Light(LightState state) {
        this.state = state;
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }

    public void clickOnButton() {
        state.onButtonClicked(this);
    }

    public void clickOffButton() {
        state.offButtonClicked(this);
    }
}