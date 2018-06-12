package chap09.observer._04.resolved2;

public class DataSheetView implements Observer {

    private ScoreRecord scoreRecord;

    public DataSheetView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
       display();
    }

    private void display() {
        System.out.println("******************** DataSheetView ********************");
        for( int score : scoreRecord.getScoreRecord() ) {
            System.out.print(score + " ");
        }
        System.out.println("");
        System.out.println("*******************************************************");
    }
}