package strings;

import java.util.Scanner;

public class BeautifulBinaryString {
    static int beautifulBinaryString(String str) {

        String uglyString = "010";
        int count =0;
        boolean checkString=true;
        int i=0;
        while(checkString) {
            for(i=0;i<=str.length()-3;i++) {
                if(uglyString.equalsIgnoreCase(str.substring(i,i+3))) {
                    count++;
                    System.out.println(str.substring(i,i+3));
                    StringBuilder builder = new StringBuilder(str);
                    builder.setCharAt(i+2,'1');
                    str = builder.toString();
                }
            }
            checkString = false;

        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        System.out.println(result);
        scanner.close();
    }
}
