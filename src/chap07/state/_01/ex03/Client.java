package chap07.state._01.ex03;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.clickOnButton();
        light.clickOnButton();
        light.clickOnButton();
        light.clickOffButton();
        light.clickOffButton();
        light.clickOnButton();
        light.clickOnButton();
        light.clickOffButton();
    }
}