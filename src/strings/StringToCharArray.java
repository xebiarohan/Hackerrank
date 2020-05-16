package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Alpha";;

        List<String> collect = Arrays.stream(str.split("")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
