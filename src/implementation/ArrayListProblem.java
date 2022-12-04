package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        List<List<Integer>> listData = new ArrayList<>();
        while (numberOfLines > 0) {
            int elementsInEachLine = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            while (elementsInEachLine > 0) {
                list.add(scanner.nextInt());
                elementsInEachLine--;
            }
            listData.add(list);
            numberOfLines--;
        }

        // Getting query data
        int queries = scanner.nextInt();
        while (queries > 0) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();
            if(y >= listData.size()) {
                System.out.println("HERE");
                System.out.println("ERROR!");
            } else {
                List<Integer> temp = listData.get(y-1);
                if(x >= temp.size()) {
                    System.out.println("HI");
                    System.out.println("ERROR!");
                } else {
                    System.out.println(temp.get(x-1));
                }
            }
            queries--;
        }
    }
}


// Sample Input
//5
//        5 41 77 74 22 44
//        1 12
//        4 37 34 36 52
//        0
//        3 20 22 33
//        5
//        1 3
//        3 4
//        3 1
//        4 3
//        5 5