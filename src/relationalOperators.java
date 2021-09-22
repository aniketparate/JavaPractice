import java.util.Scanner;
//Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.
//
//The program must output true or false.
public class relationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean value = (a + b) == 20 || (a + c) == 20 || (b + c) == 20;

        System.out.println(value);
    }
}

/*
Write a program that reads three integer numbers and prints true if the first number
is between the second and the third one (inclusive). Otherwise, it must print false.
The last two arguments may not be sorted.

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean value = a < b && a > c || a < c && a > b || a == b;
        System.out.println(value);
 */