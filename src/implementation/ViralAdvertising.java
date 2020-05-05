package implementation;

import java.util.Scanner;

public class ViralAdvertising {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        System.out.println(result);
        scanner.close();
    }

    static int viralAdvertising(int n) {
        int peopleWhoLiked = 2;
        int temp =2;
        for(int i=2;i<=n;i++) {
            temp = (temp*3)/2;
            peopleWhoLiked += temp;
        }
        return peopleWhoLiked;

    }
}
