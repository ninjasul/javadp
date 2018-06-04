package chap06.singleton._02.multhread;

public class Main {
	private static final int THREAD_NUM = 5;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		
		for( int i = 0; i < THREAD_NUM; i++ ) {
			// ��Ƽ ������ ���� �� ���� ���� printer ��ü�� ������ ���ɼ��� ����.
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
	}
}
