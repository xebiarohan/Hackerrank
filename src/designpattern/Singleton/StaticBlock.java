package designpattern.Singleton;

public class StaticBlock {
    private static StaticBlock instance;

    private StaticBlock() {}

    static {
        instance = new StaticBlock();
    }

    public StaticBlock getInstance() {
        return instance;
    }
}
