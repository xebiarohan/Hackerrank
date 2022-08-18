package designpattern.abstracefactory;


public class FootballFactory implements SportAbstractFactory {

    @Override
    public Sport getSport() {
        return new Football();
    }
}
