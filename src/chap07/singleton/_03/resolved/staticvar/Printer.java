package chap07.singleton._03.resolved.staticvar;

public class Printer {
	// 정적 변수에 바로 초기화
	private static Printer printer = new Printer();
	private int counter = 0;
	private Printer() { }
	
	public static Printer getPrinter() {		
		return printer;
	}
	
	public void print(String str) {
		// counter는 instance 변수이므로 호출 시마다 증가하지 않음.
		counter++;		// 카운터 값 증가
		System.out.println(str + counter);
	}
}
