import java.util.Scanner;

public class SherlockSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numbers = 0;
        int x = 1;
        while(x*x <= b) {
           if(x*x >= a) {
               numbers++;
           }
           x++;
        }
        System.out.println(numbers);
    }
}
