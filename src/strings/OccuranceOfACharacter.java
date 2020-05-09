package strings;

import java.util.Scanner;

public class OccuranceOfACharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToSearch = scanner.next();
        char ch = scanner.next().charAt(0);

        long count = stringToSearch.chars().filter(x -> x == (int) ch).count();
        System.out.println(count);

    }
}
