package designpattern.Singleton;

public class LazyLoading {
    private static LazyLoading lazyLoading;

    private LazyLoading(){}

    public LazyLoading getInstance() {
        if(lazyLoading == null) {
            lazyLoading = new LazyLoading();
        }
        return lazyLoading;
    }
}
