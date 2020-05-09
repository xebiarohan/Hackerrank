package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingStringListToStringArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Object[] objects = list.toArray();
        String[] strings = Arrays.copyOf(objects, objects.length, String[].class);
    }
}
