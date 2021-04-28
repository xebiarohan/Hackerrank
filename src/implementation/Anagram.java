package implementation;

import java.io.IOException;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();

        while (numberOfCases >0) {
            String testString = scanner.next();
            anagram(testString);
            numberOfCases--;
        }

    }

    public static int anagram(String s) {

        int length = s.length();
        int result = length/2;
        if (length % 2 != 0) {
            return -1;
        } else {
            char[] chars1 = s.substring(0, length / 2).toCharArray();
            char[] chars2 = s.substring(length / 2, length).toCharArray();

            for(int i=0;i<chars1.length;i++) {
                for(int j=0;j<chars2.length;j++) {
                    if(chars1[i] == chars2[j]) {
                        chars2[j] = '0';
                        result--;
                        break;
                    }
                }
            }

        }
        return result;

    }

}
