package designpattern.Singleton;

public class EagerLoading {

    private static EagerLoading eagerLoading;

    private EagerLoading(){
        eagerLoading = new EagerLoading();
    }

    public EagerLoading getInstance() {
        return eagerLoading;
    }



}
