package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {
    public static void main(String[] args) {
        Integer[] array = {10, 20, 30, 40, 50};
        reverse(array);

    }

    public static void reverse(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }
}
