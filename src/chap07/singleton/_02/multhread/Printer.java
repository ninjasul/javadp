package chap07.singleton._02.multhread;

public class Printer {
	private static Printer printer = null;
	private int counter = 0;
	private Printer() { }
	
	public static Printer getPrinter() {
		if( printer == null ) {
			try {
				// 멀티스레드 경합 상황을 재현하기 위해 1초의 딜레이 부가
				Thread.sleep(1);
			}
			catch(InterruptedException e) { }
			printer = new Printer();						
		}
		return printer;
	}
	
	public void print(String str) {
		// counter는 instance 변수이므로 호출 시마다 증가하지 않음.
		counter++;		// 카운터 값 증가
		System.out.println(str + counter);
	}
}
