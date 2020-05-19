package strings;

import java.util.Scanner;

public class StringContainingCharactersOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        System.out.println(inputString.chars().allMatch(Character::isLetter));
    }
}
