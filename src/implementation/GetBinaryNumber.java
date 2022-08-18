package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetBinaryNumber {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(getBinary(n));
    }

    private static int getBinary(int n) {
        int num = 0;
        int temp = 0;
        while (n > 0) {
            int i = n % 2;
            temp = i ==1 ? temp+1 : 0;
            if(num < temp) {
                num = temp;
            }
            n = n /2;
        }
        return num;
    }
}
