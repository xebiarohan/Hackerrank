package designpattern.abstracefactory;

public class CricketFactory implements SportAbstractFactory {


    @Override
    public Sport getSport() {
        return new Cricket();
    }
}
