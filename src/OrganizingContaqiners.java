import java.util.Arrays;
import java.util.List;

public class OrganizingContaqiners {
    public static void main(String[] args) {
//        List<Integer> l1 = Arrays.asList(0,2);
//        List<Integer> l2 = Arrays.asList(1,1);
//        List<List<Integer>> lists = Arrays.asList(l1, l2);
//        int abs1 = lists.get(0).get(0) - lists.get(1).get(0);
//        int abs2 = lists.get(1).get(1) - lists.get(0).get(1);
//        if(abs1 == abs2) {
//            System.out.println("Possible");
//        }
//        System.out.println("Impossible");
//
//        int mask = 0x000F;
//        int value = 0x2222;
//        System.out.println(value & mask);
//
//        int a = 3;
//        int b = 3.0;

        Float f1 = new Float("3.0");
        int x = f1.intValue();
        byte b = f1.byteValue();
        double d = f1.doubleValue();

        System.out.println(x + b+ d);

        int[] arr = new int[] {1,2,3,4};
        double asDouble = Arrays.stream(arr).average().getAsDouble();
        int a = (int) asDouble;
        System.out.println(a);


    }
}
