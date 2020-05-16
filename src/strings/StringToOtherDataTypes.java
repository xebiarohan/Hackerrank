package strings;

public class StringToOtherDataTypes {
    public static void main(String[] args) {
        String str1 = "10.45";
        String str2 = "10";

        System.out.println(Double.valueOf(str1));

        System.out.println(Float.valueOf(str1));

        System.out.println(Double.valueOf(str2));

        // Integer.valueOf(str1);     // NumberFormatException

        System.out.println(Integer.valueOf(str2));

        System.out.println(Byte.valueOf(str2));
    }
}
