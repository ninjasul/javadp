package chap09.observer._03.all;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); 								// 점수를 저장함
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();	// 목록 형태로 점수를 출력하는 클래스
	private MinMaxView minMaxView; 					 								// 점수의 최소값/최대값을 출력하는 클래스

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
