package chap09.observer._04.resolved2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
    private List<Integer> scoreList;

    public ScoreRecord() {
        scoreList = new ArrayList<Integer>();
    }
    public void addScore(int score) {
        scoreList.add(score);
        notifyObservers();
    }

    public List<Integer> getScoreRecord() {
        return scoreList;
    }
}