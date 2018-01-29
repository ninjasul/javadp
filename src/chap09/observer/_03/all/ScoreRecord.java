package chap09.observer._03.all;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); 						// ������ ������
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();	// ��� ���·� ������ ����ϴ� Ŭ����
	private MinMaxView minMaxView; 					 								// ������ �ּҰ�/�ִ밪�� ����ϴ� Ŭ����
	
	public void addDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetViews.add(dataSheetView);
	}

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public void addScore( int score ) {
		scores.add(score);
		
		for( DataSheetView dataSheetView: dataSheetViews ) {
			dataSheetView.update();
		}
		minMaxView.update();
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
}
