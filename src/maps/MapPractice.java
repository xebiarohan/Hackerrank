package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice practice  = new MapPractice();
        practice.test();

    }


    public void test() {
        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("John", 5);

        Map<String, Integer> stringMap2 = new HashMap<>();
        stringMap2.put("matt", 10);
        Map<Integer,Integer> integerMap = Map.ofEntries(Map.entry(1,2),Map.entry(3,4));

//        stringMap.computeIfPresent("name1", (k,v) ->  v.toUpperCase());

        stringMap.computeIfAbsent("name", v -> 10);

        stringMap.computeIfPresent("John", (k,v) -> v*v);


        stringMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
        stringMap.replaceAll((k,v) ->  12);


        stringMap.forEach((k,v) -> System.out.println(k + " " + v));

        stringMap2.forEach(
                (k1,v1) -> stringMap.merge(k1,v1,(integer, integer2) -> integer)
        );

        System.out.println(stringMap);
        // stringMap.entrySet().forEach(System.out::println);
    }
}
