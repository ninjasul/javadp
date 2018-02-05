package chap14.composite._01.initial;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard( 5, 2 );
		Monitor monitor = new Monitor(20, 30);
		
		Computer computer = new Computer();
		computer.addBody(body);
		computer.addKeyboard(keyboard);
		computer.addMonitor(monitor);
		
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		System.out.println("Computer Power: " + computerPower + "W");
		System.out.println("Computer Price: " + computerPrice + "¸¸¿ø");
	}

}
