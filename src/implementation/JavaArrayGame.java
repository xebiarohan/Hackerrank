package implementation;

import java.util.Scanner;

public class JavaArrayGame {
    public static boolean canWin(int leap, int[] game) {
        boolean result = false;
        int pointer = 0;
        if(leap > game.length) {
            return true;
        }
        while (true) {
            if(pointer + leap > game.length) {
                result = true;
                break;
            }
            break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
