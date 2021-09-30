import java.util.Scanner;
/*Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep.
  She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
  You are given three numbers: A A A, B B B and H H H. According to TV, one should sleep at least A A A hours per day,
  but no more than B B B hours. H H H is how many hours Ann sleeps.
  Task: If Ann sleeps less then A A A hours, print "Deficiency". If she sleeps more than B B B hours, print "Excess".
  If her sleep fits the recommendations, print "Normal".
  Input format: three numbers A A A, B B B, H H H, where A A A is always less than or equal to B B B.
  Sample Input 1: 6 10 8        Sample Output 1: Normal
  Sample Input 2: 7 9 10        Sample Output 2: Excess
  Sample Input 2: 7 9 2         Sample Output 2: Deficiency
  */
public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}

/*Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric, output 1;
  otherwise output any other integer.
  Sample Input 1: 2002        Sample Output 1: 1
  Sample Input 2: 2008        Sample Output 2: 37
 */
        {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            int b = a % 10;
            a = a / 10;
            int c = a % 10;
            a = a / 10;
            int d = a % 10;
            a = a / 10;

            if (a == b && c == d) {
                System.out.println("1");
            } else {
                System.out.println("37");
            }
        }

/*In a computer game, each gamer has an army of units.
  Write a program that will classify the army of your enemies corresponding to the following rules:
  Units: Category
  less than 1: no army
  from 1 to 19: pack
  from 20 to 249: throng
  from 250 to 999: zounds
  1000 and more: legion
  The program should read the number of units and output the corresponding category.
  Sample Input 1: 5          Sample Output 1: pack
  Sample Input 2: 303        Sample Output 2: zounds
 */
        {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            if (a < 1) {
                System.out.println("no army");
            } else if (a >= 1 && a < 20) {
                System.out.println("pack");
            } else if (a >= 20 && a < 250) {
                System.out.println("throng");
            } else if (a >= 250 && a < 1000) {
                System.out.println("zounds");
            } else {
                System.out.println("legion");
            }
        }

/*Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
  Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
  Each segment is 1x1 and unbreakable. Find out whether it is possible to break off exactly K segments from the chocolate
  with a single straight line: vertical or horizontal.
  Input data format
  The program gets an input of three integers: N, M, K.
  Output data format
  The program must output one of the two words: YES or NO.
  Sample Input 1: 4 2 6          Sample Output 1: YES
  Sample Input 2: 2 10 7         Sample Output 2: NO
  Sample Input 3: 7 4 21         Sample Output 3: YES
 */
        {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if ((k % m == 0 || k % n == 0) && k < m * n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

/*Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.
  Do not forget that zero is not a positive number.
  Sample Input 1: 7          Sample Output 1: YES
 */
        {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            if (a > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

/*Given three natural numbers A, B, and C. Determine if a triangle with these sides can exist.
  If the triangle exists, output the "YES" string; otherwise, output "NO".
  A triangle is valid if the sum of its two sides is greater than the third side. If three sides are A, B, and C, then three conditions should be met.
  Sample Input 1: 3 4 5          Sample Output 1: YES
 */
        {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

/*Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞). Otherwise, print False (case sensitive).
 Notes:
    numbers denoted with a parenthesis () are exclusive;
    numbers denoted with a square bracket [] are inclusive.
  Sample Input 1: 20          Sample Output 1: True
  Sample Input 2: -20         Sample Output 2: False
 */
        {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            if (a > -15 && a <= 12 || a > 14 && a < 17 || a >= 19) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

/*Find whether the given year is a leap year.
  Just a reminder: leap years are those years in which the year’s number is either divisible by 4, but not divisible by 100,
  or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).
  The program should work correctly for the years 1900 ≤ n ≤ 3000.
  Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.
  It is enough to write a simple conditional statement to solve this task.
  Sample Input 1: 2100          Sample Output 1: Regular
  Sample Input 2: 2000          Sample Output 2: Leap
 */
        {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }

/*You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
  Input data format
  Four integer numbers x1,y1,x2,y2x_1, y_1, x_2, y_2x1​,y1​,x2​,y2​.
  Output data format
  Type "YES" (uppercase) if they hit each other or "NO" if they don't.
  You may need a method that calculates the absolute value of the number, so here it is:  Math.abs(n)
  Sample Input 1: 1 1 3 3         Sample Output 1: YES
  Sample Input 2: 1 1 4 3         Sample Output 2: NO
  Sample Input 3: 2 2 5 2         Sample Output 3: YES
 */
        {
            Scanner sc = new Scanner(System.in);

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }