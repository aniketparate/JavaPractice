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
*/
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean value = a < b && a > c || a < c && a > b || a == b;
        System.out.println(value);
 

/*
Groundhogs like to throw fun parties, and at their parties, they like to eat Reese's peanut butter cups.
But not too many of them, or they feel sick! A successful groundhog party will have between 10 and 20
Reese's peanut butter cups, inclusive, unless it is the weekend, in which case they will need 15 to 25
Reese's peanut butter cups, inclusive.

Write a Java program that reads two values:
    the first is the number of Reese's peanut butter cups;
    the second is a boolean representing whether it is the weekend.
The program must print a boolean value that indicates whether the party was successful.
*/
        int cups = sc.nextInt();
        boolean weekend = sc.nextBoolean();

        boolean weekdaycups = cups >= 10 && cups <= 20;
        boolean weekendcups = cups >= 15 && cups <= 25;

        System.out.println(!weekend && weekdaycups || weekend && weekendcups);
--------------------------------------------------------------------------------------------->code
        int num = sc.nextInt();
        boolean a = sc.nextBoolean();

        boolean day =  (num >= 15 && num <=25 && a) || (num >10 && num <20);

        System.out.println(day);
 

/*
Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0).
Otherwise, it should print false.
 */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean value = (a > 0 || b > 0 || c > 0) && (a != b && b != c && c != a);

        System.out.println(value);
----------------------------------------------------------------------------------------------->code
        boolean value1 = a > 0 && b <= 0 && c <= 0;
        boolean value2 = a <= 0 && b > 0 && c <= 0;
        boolean value3 = a <= 0 && b <= 0 && c > 0;

        System.out.println(value1 || value2 || value3);
