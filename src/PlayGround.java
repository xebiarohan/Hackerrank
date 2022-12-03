import java.math.BigInteger;
import java.util.Arrays;

public class PlayGround {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("011100", 2);
        int numberOfOperations = 0;
        while (number.compareTo(BigInteger.valueOf(0)) > 0) {
            numberOfOperations++;
            if (number.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
                number = number.divide(BigInteger.valueOf(2));
            } else {
                number = number.subtract(BigInteger.valueOf(1));
            }
        }

        System.out.println(numberOfOperations);

    }
}
