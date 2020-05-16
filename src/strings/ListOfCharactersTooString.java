package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfCharactersTooString {
    public static void main(String[] args) {
        List<Character> characters = Arrays.asList('a', 's', 'd', 'f', 'g');

        String str = characters
                .stream()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining());

        System.out.println(str);
    }
}
