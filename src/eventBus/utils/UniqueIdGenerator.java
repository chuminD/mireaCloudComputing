package eventBus.utils;

public class UniqueIdGenerator {
    private int id;
    public  UniqueIdGenerator() {
        id = 0;
    }
    public int generateID () {
        return ++id;
    }
}
