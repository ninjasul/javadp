package chap07.state._01.ex03;

public interface LightState {
    void onButtonClicked(Light light);
    void offButtonClicked(Light light);
}