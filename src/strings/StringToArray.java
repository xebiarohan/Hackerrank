package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToArray {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6";

        String[] split = str.split(",");

        List<String> collect = Arrays.stream(split).collect(Collectors.toList());
        System.out.println(collect);
    }
}
