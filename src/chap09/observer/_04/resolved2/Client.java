package chap09.observer._04.resolved2;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView);
        scoreRecord.attach(minMaxView);

        scoreRecord.addScore(7);
        scoreRecord.addScore(9);
        scoreRecord.addScore(4);
        scoreRecord.addScore(3);
    }
}