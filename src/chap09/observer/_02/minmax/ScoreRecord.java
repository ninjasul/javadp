package chap09.observer._02.minmax;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장함
	private MinMaxView minMaxView; 					 // 목록 형태로 점수를 출력하는 클래스
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public void addScore( int score ) {
		scores.add(score);
		minMaxView.update();
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
}
