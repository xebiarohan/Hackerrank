package array;

import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,132};

        int valueToSearch = 5;
        boolean b = Arrays.stream(array).anyMatch(x -> x == valueToSearch);
        System.out.println(b);
    }
}
