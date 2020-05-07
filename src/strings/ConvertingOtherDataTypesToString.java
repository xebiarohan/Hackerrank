package strings;

import java.util.Arrays;

public class ConvertingOtherDataTypesToString {
    public static void main(String[] args) {
        Float float1 = 1f;
        float float2  = 2;
        Short shortValue = 10;
        Double doubleValue = 20d;
        Byte byteValue = 20;
        int[] integers = {1,2,3,4,5};

        String str1 = String.valueOf(float1);
        String str2 = String.valueOf(float2);
        String str3 = String.valueOf(shortValue);
        String str4 = String.valueOf(doubleValue);
        String str5 = String.valueOf(byteValue);

        String arrayString = Arrays.toString(integers);

        System.out.println(str1 + "  " + str2 + " " + str3 + " " + str4 + " " + str5);
    }
}
