package chap07.singleton._04.resolved.synchronization;

public class Printer {
	private static Printer printer = null;
	private int counter = 0;
	private Printer() { }
	
	// 메서드에 동기화 설정
	public synchronized static Printer getPrinter() {
		if( printer == null ) {
			printer = new Printer();						
		}
		return printer;
	}
	
	public void print(String str) {
		// 블록에 동기화 설정
		synchronized(this) {
			counter++;		// 카운터 값 증가
			System.out.println(str + counter);
		}
	}
}
