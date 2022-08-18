package designpattern.Singleton;

public class SingletonBetterWay {
    private SingletonBetterWay instance;
    private SingletonBetterWay() {}

    public SingletonBetterWay getInstance() {
        if(instance == null) {
            synchronized (SingletonFirstWay.class) {
                if(instance == null) {
                    instance = new SingletonBetterWay();
                }
            }
        }
        return instance;
    }
}
