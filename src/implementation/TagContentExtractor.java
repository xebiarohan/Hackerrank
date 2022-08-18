package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class TagContentExtractor {
    public static void main(String[] args) {
        String str = "<h1>Nayeem loves counseling</h1>";
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();

        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> integers1 = List.of(1, 2);

        integers.forEach(System.out::println);

        ArrayList list1 = new ArrayList();

    }
}
