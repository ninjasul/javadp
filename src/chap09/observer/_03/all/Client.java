package chap09.observer._03.all;

public class Client {
	public static void main (String[] args ) {
		ScoreRecord scoreRecord = new ScoreRecord ();
				
		// 3 �� ����� DataSheetView �鼺
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		
		// 5 �� ����� DataSheetView ����
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord); 	// MinMaxView ����
		scoreRecord.addDataSheetView(dataSheetView3); 			// 3�� ��� DataSheetView
		scoreRecord.addDataSheetView(dataSheetView5); 			// 5�� ��� DataSheetView
		scoreRecord.setMinMaxView (minMaxView);  				// MinMaxView ����
				
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50�� �߰���, �߰��� ������ �ִ� 3���� ������ �����
			scoreRecord.addScore(score);
		}
	}
}
