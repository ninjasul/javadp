package chap06.singleton._03.resolved.staticvar;

public class Printer {
	// ���� ������ �ٷ� �ʱ�ȭ
	private static Printer printer = new Printer();
	private int counter = 0;
	private Printer() { }
	
	public static Printer getPrinter() {		
		return printer;
	}
	
	public void print(String str) {
		// counter�� instance �����̹Ƿ� ȣ�� �ø��� �������� ����.
		counter++;		// ī���� �� ����
		System.out.println(str + counter);
	}
}
