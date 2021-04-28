package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        extraLongFactorials(n);

    }

    public static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");
        while (n>=1) {
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(factorial);
    }
}

