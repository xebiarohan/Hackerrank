package strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class RemoveWordFromString {
    public static void main(String[] args) {
        String statement = "My name is Mr Rohan Aggarwal";

        String finalString = Arrays
                .stream(statement.split(" "))
                .filter(x -> !x.equalsIgnoreCase("Mr"))
                .collect(Collectors.joining(" "));

        System.out.println(finalString);



    }
}
