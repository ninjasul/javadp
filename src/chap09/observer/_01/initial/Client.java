package chap09.observer._01.initial;

public class Client {
	public static void main (String[] args ) {
		ScoreRecord scoreRecord = new ScoreRecord ();
		
		// 3 �������� ������ �����
		DataSheetView dataSheetView = new DataSheetView (scoreRecord, 3);		
		scoreRecord.setDataSheetView( dataSheetView );
		
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50�� �߰���, �߰��� ������ �ִ� 3���� ������ �����
			scoreRecord.addScore(score);
		}
	}
}
