package eventBus.event;

public class SimpleObserver implements Observing {
    private int id;

    public SimpleObserver(int id) {
        this.id = id;
    }

    @Override
    public void handleEvent() {
        System.out.println("Some event handled by observer ID: "+this.getId());
    }

    @Override
    public String toString() {
        return ""+this.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int uniqueId) {
        this.id = uniqueId;
    }
}
