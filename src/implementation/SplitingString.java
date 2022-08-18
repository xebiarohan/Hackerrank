package implementation;

import java.util.Scanner;

public class SplitingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >0) {
            String str = sc.next();
            String odd = "";
            String even = "";
            for(int i=0;i<str.length();i++) {
                if (i % 2 == 0) {
                    even +=str.charAt(i);
                } else {
                    odd +=str.charAt(i);
                }
            }
            num--;
            System.out.println(even + " " + odd);
        }
    }
}
