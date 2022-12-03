package concepts;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        Iterator<Integer> itr = integers.iterator();

        while (itr.hasNext()){
            integers.remove(itr.next());
        }
        System.out.println(integers);
    }
}
