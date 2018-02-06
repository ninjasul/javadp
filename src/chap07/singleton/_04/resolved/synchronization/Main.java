package chap07.singleton._04.resolved.synchronization;

public class Main {
	private static final int THREAD_NUM = 5;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		
		for( int i = 0; i < THREAD_NUM; i++ ) {
			// 멀티 스레드 경합 시 여러 개의 printer 객체가 생성될 가능성이 있음.
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
	}
}
