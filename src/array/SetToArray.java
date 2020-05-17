package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class SetToArray {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);

        int[] ints = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(ints));


        // Set of String
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Alpha");
        stringSet.add("Beta");
        stringSet.add("gamma");

        String[] strings1 = stringSet.toArray(new String[0]);
        System.out.println(Arrays.toString(strings1));

        String[] strings = stringSet.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
}
