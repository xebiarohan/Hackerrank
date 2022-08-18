package designpattern.abstracefactory;

public class Executor {
    public static void main(String[] args) {
        Sport sport = SportFactory.getSport(new CricketFactory());
        sport.play();
    }
}
