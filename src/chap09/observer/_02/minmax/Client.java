package chap09.observer._02.minmax;

public class Client {
	public static void main (String[] args ) {
		ScoreRecord scoreRecord = new ScoreRecord ();

		// 3 개까지의 접수만 출력함
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		scoreRecord.setMinMaxView(minMaxView);

		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50을 추가함, 추가할 때마다 최대 3개의 점수만 출력함
			scoreRecord.addScore(score);
		}
	}
}
