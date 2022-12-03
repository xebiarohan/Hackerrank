package sortings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list :");
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

       // bubbleSort(arr);
       // selectionSort(arr);
        insertionSort(arr);

        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] < arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

    public <T> void printArray(T[] arr) {
       Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(List<Integer> a, int index1, int index2) {
        int temp = a.get(index1);
        a.add(index1, a.get(index2));
        a.add(index2, temp);
    }


    private static void selectionSort(int[] arr) {
        for(int i=0; i< arr.length -1;i++) {
            int min = i;
            int temp = arr[i];
            for (int j = i+1; j< arr.length;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    private static void insertionSort(int[] arr) {
        if(arr.length < 1) {
            return;
        }

        for(int i= 1; i< arr.length; i++) {
            int j = i-1;
            int val = arr[i];
            while(j >= 0) {
                if(val < arr[j]) {
                    int temp = val;
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                } else {
                    break;
                }
            }
        }
    }
}
