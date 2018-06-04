package chap06.singleton._05.resolved.staticclass;

// ���� Ŭ������ ����� ������ ��ü�� ������ �ʿ� ���� ����.
// ������ �������̽��� �����ϴ� ��쿡�� �� ����� ����� �� ����.
// �������̽����� ���� �޼��带 ������ �� ���� ������.
public class Printer {
	private static int counter = 0;

	// �޼��� ����ȭ
	public synchronized static void print(String str) {
		counter++;		// ī���� �� ����
		System.out.println(str + counter);
	}
}
