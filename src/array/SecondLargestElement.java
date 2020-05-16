package array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {45,23,78,23,56};
        int secondLargestElement = getSecondLargestElement(array);
        System.out.println(secondLargestElement);
    }

    private static Integer getSecondLargestElement(int[] array) {
        int largestElement = -1;
        int secondLargestElement = -1;

        for(int i=0;i<array.length;i++) {
            if(array[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = array[i];
            } else if(array[i] > secondLargestElement) {
                secondLargestElement = array[i];
            }
         }
        return secondLargestElement;
    }
}
