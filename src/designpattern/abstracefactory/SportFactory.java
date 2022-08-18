package designpattern.abstracefactory;

public class SportFactory {
    public static Sport getSport(SportAbstractFactory abstractFactory) {
        return abstractFactory.getSport();
    }
}
