package array;

import java.util.Arrays;

public class MamimumUniqueIntegersInSubArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 5, 2, 3, 2};
        int subArraySize = 3;
        int maxUnique = 0;

        for(int i=0;i<array.length-subArraySize +1;i++) {
            int[] subArray = Arrays.copyOfRange(array, i, i +subArraySize);
            long count = Arrays.stream(subArray).distinct().count();
            if(count > maxUnique) {
               maxUnique = (int)count;
           }

        }

        System.out.println(maxUnique);
    }
}
