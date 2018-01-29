package chap09.observer._04.resolved;

public class Client {
	public static void main (String[] args ) {
		ScoreRecord scoreRecord = new ScoreRecord ();
		
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord); 	// MinMaxView 생성
		
		scoreRecord.attach(dataSheetView3); 			// 3개 목록 DataSheetView
		scoreRecord.attach(dataSheetView5); 			// 5개 목록 DataSheetView
		scoreRecord.attach (minMaxView);  				// MinMaxView 설정
				
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50을 추가함
			scoreRecord.addScore(score);
		}
		
		scoreRecord.detach(dataSheetView3);
		StatisticView statisticView = new StatisticView(scoreRecord);
		scoreRecord.attach(statisticView);
		
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println ("Adding " + score );
			// 10 20 30 40 50을 추가함
			scoreRecord.addScore(score);
		}
	}
}
