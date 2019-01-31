package chap09.observer._04.resolved;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	private List<Integer> scores = new ArrayList<Integer>(); 						// 점수를 저장함

	public void addScore( int score ) {
		scores.add(score);
		notifyObservers();
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
