package implementation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SequenceEquation {
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] results = new int[p.length];

        List<Integer> list = Arrays.stream(p).boxed().collect(Collectors.toList());
        for (int i = 1; i <= p.length; i++) {
            int p1 = list.indexOf(i);
            results[i-1] = list.indexOf(p1+1)+1;
        }

        return results;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        System.out.println(result);
        scanner.close();
    }
}
