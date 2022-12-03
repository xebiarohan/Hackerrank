package implementation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(770528134, 663501748, 384261537, 800309024, 103668401, 538539662, 385488901, 101262949, 557792122, 46058493);
        // 770528134, 663501748, false, 800309024, false, false, false, 101262949, false, 46058493

        int i = nonDivisibleSubset(5, integers.stream().mapToLong(x -> x).boxed().collect(Collectors.toList()));
        System.out.println(i);
    }

    public static int nonDivisibleSubset(int k, List<Long> s) {
        List<Long> list =  new ArrayList<>();
        int length = 0;


        for(int i=0;i <s.size()-1;i++) {
            list.add(s.get(i));
            for(int j=i+1;j<s.size();j++) {
                long finalJ = s.get(j);
                boolean match = list.stream().allMatch(x -> (x + finalJ) % k != 0);
                // ., true, false, true, false, false, false, true,false, true
                if(match) {
                    list.add(finalJ);
                }

            }
            if(list.size() > length) {
                length = list.size();
            }
            list.clear();
        }
        return length;

    }
}
