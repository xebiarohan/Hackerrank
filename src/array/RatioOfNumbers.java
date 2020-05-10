package array;

import java.util.Arrays;
import java.util.Scanner;

public class RatioOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i=0;i<arraySize;i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
        long positiveNumbers = Arrays.stream(array).filter(x -> x % 2 == 0).count();
        long negativeNumbers = Arrays.stream(array).filter(x -> x % 2 != 0).count();

        System.out.println((float)positiveNumbers/(float)arraySize);
        System.out.println((float) negativeNumbers/(float)arraySize);
    }
}
