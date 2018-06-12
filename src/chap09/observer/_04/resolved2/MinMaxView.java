package chap09.observer._04.resolved2;

import java.util.Collections;

public class MinMaxView implements Observer {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        display();
    }

    private void display() {
        System.out.println("******************** MinMaxView ********************");
        System.out.println("Minimum value: " + Collections.min( scoreRecord.getScoreRecord() ) );
        System.out.println("Maximum value: " + Collections.max( scoreRecord.getScoreRecord() ) );
        System.out.println("****************************************************");
    }
}