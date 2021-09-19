import java.util.Scanner;

public class printEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println();

        if (a % 2 == 0) {
            System.out.println(a + 2);
        }
        else {
            System.out.println(a + 1);
        }

    }
}
