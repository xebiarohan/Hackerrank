package implementation;

import java.util.Scanner;

public class MinimumSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int i = numberOfNegativeSubArray(arr);
        System.out.println(i);
        //1 -2 4 -5 1
    }

    public static int numberOfNegativeSubArray(int[] arr) {
        int num = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            int temp = arr[i];;
            if (arr[i] < 0) {
                num++;
            }
            for (int j = i + 1; j <= arr.length-1; j++) {
                int x = temp + arr[j];
                if(x < 0) {
                    num++;
                }
                temp = x;

            }
        }

        return num;
    }
}
