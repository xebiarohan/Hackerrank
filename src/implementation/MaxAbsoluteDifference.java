package implementation;

import java.math.BigInteger;
import java.util.Arrays;

public class MaxAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = new int[] {10,4,6,1,45,23};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1] - arr[0]);

        String s = "12";

        BigInteger bigInteger = new BigInteger(s);
        boolean probablePrime = bigInteger.isProbablePrime(0);
        System.out.println(probablePrime);
    }
}
