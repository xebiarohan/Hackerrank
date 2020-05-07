package strings;

import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenLengthWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] split = str.split(" ");
        Arrays
                .stream(split)
                .filter(s -> s.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
