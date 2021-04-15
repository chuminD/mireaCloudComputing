package eventBus.event;

public interface Observed {
    void addObserver (Observing o);
    void removeObserver (Observing o);
    void notifyObserver();
}
