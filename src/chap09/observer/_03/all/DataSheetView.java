package chap09.observer._03.all;

import java.util.List;

public class DataSheetView {

	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView( ScoreRecord scoreRecord, int viewCount ) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScores( record, viewCount );
	}

	// viewCount 만큼 List를 순회하면서 입력된 점수를 출력함.
	private void displayScores( List<Integer> record, int viewCount ) {
		System.out.println("List of " + viewCount + " entries: " );
		for( int i = 0; i < viewCount && i < record.size(); i++ ) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}

}
