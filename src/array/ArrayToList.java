package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(array);

        System.out.println(list);

        int[] array2 = {4,5,6,7,8};
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
        System.out.println(list2);
    }
}
