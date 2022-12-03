package concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

//        for (int i = 0; i < integers.size(); i++) {
//            if(i%2 == 0) {
//                integers.remove(i);
//            }
//        }

//        for (Integer integer: integers) {
//                integers.remove(integer);
//        }

        Iterator<Integer> itr = integers.iterator();

        while (itr.hasNext()) {
            //integers.remove(itr.next());  Exception
            if(itr.next()%2 == 0) {
                itr.remove();
                break;
            }

        }

        itr.forEachRemaining(System.out::println);


    }
}
