package implementation;

import java.util.Arrays;
import java.util.List;

public class HourGlass {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> b = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> c = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> d = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> e = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> f = Arrays.asList(0, 0, 1, 2, 4, 0);

        List<List<Integer>> lists = Arrays.asList(a, b, c, d, e, f);
        System.out.println( maxValue(lists));

    }

    private static int maxValue(List<List<Integer>> arr) {
        int result = Integer.MIN_VALUE;
        for(int j = 0;j <4;j++) {       // rows
            for(int i =0;i<4;i++) {
                int temp = arr.get(j).get(i) + arr.get(j).get(i+1) + arr.get(j).get(i+2)
                                + arr.get(j+1).get(i+1)
                                + arr.get(j+2).get(i) + arr.get(j+2).get(i+1) + arr.get(j+2).get(i+2);
                if(temp > result) {
                    result = temp;
                }
            }
        }

        return result;
    }
}
