package designpattern.factory;

import java.util.Scanner;

public class SportFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which Sport would you like to play");
        String sportToPlay = scanner.next();

        Sport sport = new Football();

        if(sportToPlay.equals("Cricket")) {
            sport = new Cricket();
        }

        sport.play();
    }
}
