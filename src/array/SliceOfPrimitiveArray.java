package array;

import java.util.Arrays;

public class SliceOfPrimitiveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(newArr));

    }
}
