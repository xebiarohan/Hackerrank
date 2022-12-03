import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheStick {
    public static void main(String[] args) {
        System.out.println( cutTheSticks(List.of(5)));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr.size());
        while(true) {
            int min = Collections.min(arr);
            arr = arr.stream().map(x -> x - min).filter(x -> x > 0).collect(Collectors.toList());

            if(arr.size() >= 1) {
                list.add(arr.size());
                if(arr.size() == 1) {
                    break;
                }
            }
            if(arr.size() < 1) {
                break;
            }
        }

        return list;
    }
}
