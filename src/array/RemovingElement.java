package array;

import java.util.Arrays;

public class RemovingElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,5,1,57,1,5};
        int elementToRemove = 1;

        array = Arrays.stream(array).filter(x -> x != elementToRemove).toArray();

        System.out.println(Arrays.toString(array));
    }
}
