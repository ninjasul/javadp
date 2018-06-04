package chap06.singleton._02.multhread;

public class UserThread extends Thread {
	private String name;
	
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		Printer printer = Printer.getPrinter();
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + "." );
	}
}
