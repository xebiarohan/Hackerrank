package implementation;

import java.io.*;
import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int result = Result.findDigits(n);

            System.out.println(result);
        }

    }
}


class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        int temp = n;
        int numberOfDivisor = 0;
        while(temp !=0) {
            int remainder = temp%10;
            temp = temp/10;
            if(remainder !=0 && n%remainder ==0) {
                numberOfDivisor++;
            }
        };

        return numberOfDivisor;
    }

}
