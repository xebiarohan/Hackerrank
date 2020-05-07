package strings;

public class ConvertingStringToOtherDataTypes {
    public static void main(String[] args) {
        String str = "100";

        Double aDouble = Double.valueOf(str);
        Float aFloat = Float.valueOf(str);
        Integer integer = Integer.valueOf(str);
        Byte aByte = Byte.valueOf(str);
        Short aShort = Short.valueOf(str);

    }
}
