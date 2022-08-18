package designpattern.Singleton;

public class SingletonFirstWay {
    private SingletonFirstWay instance;
    private SingletonFirstWay() {}

    public synchronized SingletonFirstWay getInstance() {
        if(instance == null) {
            instance = new SingletonFirstWay();
        }
        return instance;
    }
}
