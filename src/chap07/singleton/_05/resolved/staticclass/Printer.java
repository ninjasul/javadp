package chap07.singleton._05.resolved.staticclass;

// 정적 클래스로 만들어 버리면 객체를 생성할 필요 조차 없음.
// 하지만 인터페이스를 구현하는 경우에는 이 방법을 사용할 수 없음.
// 인터페이스에는 정적 메서드를 선언할 수 없기 때문임.
public class Printer {
	private static int counter = 0;

	// 메서드 동기화
	public synchronized static void print(String str) {
		counter++;		// 카운터 값 증가
		System.out.println(str + counter);
	}
}
