package strings;

public class ChangingCharacterAtSpecificIndex {
    public static void main(String[] args) {
        String str = "Alpha";
        StringBuilder builder = new StringBuilder(str);
        builder.setCharAt(0,'a');
        String newString = builder.toString();
        System.out.println(newString);
    }
}
