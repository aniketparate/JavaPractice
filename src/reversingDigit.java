import java.util.Scanner;

public class reversingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 10 == 0) {
            a = a / 10;
        }

        while (a % 10 != 0) {
            int b = a % 10;
            a = a / 10;
            System.out.print(b);
        }
    }
}
