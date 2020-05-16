package strings;

import java.util.stream.IntStream;

public class IntStreamToString {
    public static void main(String[] args) {
        IntStream astream = IntStream.of('a', 'b', 'c');
        int[] ints = astream.toArray();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<ints.length;i++) {
            builder.append((char)ints[i]);
        }
        System.out.println(builder.toString());


        // Second way
        IntStream bstream = IntStream.of('a', 'b', 'c');
        String str = bstream.collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append).toString();

        System.out.println(str);

    }
}
