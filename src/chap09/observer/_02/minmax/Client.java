package chap09.observer._02.minmax;

public class Client {
	public static void main (String[] args ) {
		ScoreRecord scoreRecord = new ScoreRecord ();
		
		// 3 �������� ������ �����
		MinMaxView minMaxView = new MinMaxView(scoreRecord);		
		scoreRecord.setMinMaxView(minMaxView);
		
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50�� �߰���, �߰��� ������ �ִ� 3���� ������ �����
			scoreRecord.addScore(score);
		}
	}
}
