package chap14.composite._02.resolved;

public class Keyboard extends ComputerDevice {
	private int price;
	private int power;
	
	public Keyboard(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() {
		return price;
	}
		
	public int getPower() {
		return power;
	}
}
