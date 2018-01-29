package chap09.observer._01.initial;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
	private DataSheetView dataSheetView; 					 // ��� ���·� ������ ����ϴ� Ŭ����
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	public void addScore( int score ) {
		scores.add(score);
		dataSheetView.update();
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
}
