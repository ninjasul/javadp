package chap07.state.ex03;

public interface LightState {
    void onButtonClicked(Light light);
    void offButtonClicked(Light light);
}