package chap09.observer._03.all;

public class Client {
	public static void main (String[] args ) {
		ScoreRecord scoreRecord = new ScoreRecord ();

		// 3 개 목록의 DataSheetView 썽성
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);

		// 5 개 목록의 DataSheetView 샘성
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord); 	// MinMaxView 생성
		scoreRecord.addDataSheetView(dataSheetView3); 			// 3개 목록 DataSheetView
		scoreRecord.addDataSheetView(dataSheetView5); 			// 5개 목록 DataSheetView
		scoreRecord.setMinMaxView (minMaxView);  				// MinMaxView 설정

		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50을 추가함, 추가할 때마다 최대 3개의 점수만 출력함
			scoreRecord.addScore(score);
		}
	}
}
