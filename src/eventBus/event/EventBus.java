package eventBus.event;

import java.util.ArrayList;
import java.util.List;

public class EventBus implements Observed {
    List<Observing> observers = new ArrayList<>();

    @Override
    public void addObserver(Observing o) {
        observers.add(o);
        System.out.println("Observer "+ o.toString()+" added");
    }

    @Override
    public void removeObserver(Observing o) {
        observers.remove(o);
        System.out.println("Observer "+ o.toString()+" removed");
    }

    @Override
    public void notifyObserver() {
        for (Observing o: observers) {
            o.handleEvent();
        }
    }
}
