package chap06.singleton._05.resolved.staticclass;

public class UserThread extends Thread {

	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		Printer.print(Thread.currentThread().getName() + " print using " + "." );
	}
}
