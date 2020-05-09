package strings;

public class RemoveExtraDelimiter {
    public static void main(String[] args) {
        String str = "alpha,";
        String substring = str.substring(0, str.length() - 1);
        System.out.println(substring);
    }
}
