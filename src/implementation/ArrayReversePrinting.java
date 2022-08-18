package implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ArrayReversePrinting {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4);

        Collections.reverse(arr);
        String collect = arr.stream().map(x -> x.toString()).collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
