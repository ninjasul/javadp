package chap06.singleton._04.resolved.synchronization;

public class Printer {
	private static Printer printer = null;
	private int counter = 0;
	private Printer() { }
	
	// �޼��忡 ����ȭ ����
	public synchronized static Printer getPrinter() {
		if( printer == null ) {
			printer = new Printer();						
		}
		return printer;
	}
	
	public void print(String str) {
		// ��Ͽ� ����ȭ ����
		synchronized(this) {
			counter++;		// ī���� �� ����
			System.out.println(str + counter);
		}
	}
}
