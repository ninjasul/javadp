package chap06.singleton._02.multhread;

public class Printer {
	private static Printer printer = null;
	private int counter = 0;
	private Printer() { }
	
	public static Printer getPrinter() {
		if( printer == null ) {
			try {
				// ��Ƽ������ ���� ��Ȳ�� �����ϱ� ���� 1���� ������ �ΰ�
				Thread.sleep(1);
			}
			catch(InterruptedException e) { }
			printer = new Printer();						
		}
		return printer;
	}
	
	public void print(String str) {
		// counter�� instance �����̹Ƿ� ȣ�� �ø��� �������� ����.
		counter++;		// ī���� �� ����
		System.out.println(str + counter);
	}
}
