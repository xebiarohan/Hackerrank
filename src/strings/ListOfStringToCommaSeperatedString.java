package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfStringToCommaSeperatedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<String> strings = new ArrayList<>();

        for(int i=0;i<number;i++) {
            strings.add(scanner.next());
        }

        String result = strings.stream().collect(Collectors.joining(","));
        System.out.println(result);

    }

}
