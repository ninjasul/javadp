package chap09.observer._04.resolved2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList;

    public Subject() {
        observerList = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for( Observer o : observerList ) {
            o.update();
        }
    }
}