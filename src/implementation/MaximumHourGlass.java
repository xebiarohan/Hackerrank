package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumHourGlass {

    public static void main(String[] args) {
        int max = 0;
        List<List<Integer>> arr = new ArrayList<>();
        int[][] array = arr.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                int sum = array[i][j] + array[i][j+1] + array[i][j+2]
                        + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];

                if(sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
