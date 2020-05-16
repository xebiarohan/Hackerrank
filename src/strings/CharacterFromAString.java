package strings;

import java.util.Scanner;

public class CharacterFromAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int index = scanner.nextInt();

        if(index > str.length()) {
            throw new IndexOutOfBoundsException("Index is more than the length of the string");
        }

        char[] chars = str.toCharArray();

        System.out.println(chars[index - 1]);

    }
}
