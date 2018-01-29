package chap09.observer._01.initial;

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
	
	// viewCount ��ŭ List�� ��ȸ�ϸ鼭 �Էµ� ������ �����.
	private void displayScores( List<Integer> record, int viewCount ) {
		System.out.println("List of " + viewCount + " entries: " );
		for( int i = 0; i < viewCount && i < record.size(); i++ ) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}

}
