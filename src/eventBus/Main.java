package eventBus;

import eventBus.event.EventBus;
import eventBus.event.SimpleObserver;
import eventBus.utils.UniqueIdGenerator;

public class Main {
    public static void main(String[] args) {
        UniqueIdGenerator generator = new UniqueIdGenerator();
        EventBus bus = new EventBus();

        SimpleObserver observer0 = new SimpleObserver(generator.generateID());
        SimpleObserver observer1 = new SimpleObserver(generator.generateID());
        SimpleObserver observer2 = new SimpleObserver(generator.generateID());

        bus.addObserver(observer0);
        bus.addObserver(observer1);
        bus.addObserver(observer2);

        bus.notifyObserver();

        bus.removeObserver(observer0);
        bus.removeObserver(observer1);
        bus.removeObserver(observer2);
    }
}
