//Snail creeps up the vertical pole of height H feet. It goes A feet up per day, and B feet down per night.
//In which day will the snail reach the top of the pole?
//Sample Input 1: 10; 3; 2
//Sample Input 2: 20; 7; 3

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int b = 0;
        System.out.print(" Height : ");
        int H = sc.nextInt();
        System.out.print(" A : ");
        int A = sc.nextInt();
        System.out.print(" B : ");
        int B = sc.nextInt();

        //day = (h - b - 1) / (a - b) + 1; direct formula to calculate days
        while (b < H) {
            count = count + 1;
            b = b + A;
            if (b == H) {
                continue;
            }
            b = b - B;
        }
        System.out.println(count);
    }
}

//Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.
//Sample Input 1: 320              Sample Output 1: 23
//Sample Input 2: 976              Sample Output 2: 679
        {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 10 == 0) {
        a = a / 10;
        int b = a % 10;
        System.out.print(b);
        int c = a / 10;
        System.out.print(c);
        } else {
        int b = a % 10;
        a = a / 10;
        System.out.print(b);
        int c = a % 10;
        System.out.print(c);
        a = a / 10;
        System.out.print(a);
        }

//N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.
//Input data format
//There are two positive numbers N and K, each of them is not greater than 10000.
// Sample Input 1:  3  14        Sample Output 1: 4
        {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b / a;

        System.out.println(c);

        }

//N squirrels found K nuts and decided to divide them equally.
// Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.
//Input data format
//There are two positive integers N and K, each of them is not greater than 10000.
//Sample Input 1:  3  14        Sample Output 1: 2
        {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b % a;

        System.out.println(c);
        }

//Find how many seconds passed between the two moments of time on the same day.
//You are given the integer values representing these moments: hours, minutes and seconds for each of them.
// It is guaranteed that the earlier moment goes first in the input.
//Input data format
//The program gets the input of six integers:
//three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.
//For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).
//Output data format
//Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.
//Sample Input 1: 1 1 1 2 2 2       Sample Output 1: 3661
//Sample Input 2: 1 2 30 1 3 20     Sample Output 2: 50
        {
        Scanner sc=new Scanner(System.in);

        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int s1=sc.nextInt();
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int s2=sc.nextInt();

        int a=h2*60*60+m2*60+s2-h1*60*60-m1*60-s1;

        System.out.println(a);
        }

//Write a program that will help people who are going on vacation.
// The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.
//There are four parameters which have to be considered:
//    duration in days
//    total food cost per day
//    one-way flight cost
//    cost of one night in a hotel (the number of nights equal duration minus one)
//Read values of these parameters from the standard input and then print the result.
//Sample Input 1: 7 30 100 40       Sample Output 1: 650
        {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int food = sc.nextInt();
        int flight = sc.nextInt();
        int nights = sc.nextInt();

        int total = day * food + 2 * flight + (day - 1) * nights;

        System.out.println(total);
        }

//Given a natural number, not greater than 10000. Output the even number following this number.
//Sample Input 1: 7       Sample Output 1: 8
//Sample Input 2: 8       Sample Output 2: 10
        {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0) {
        System.out.println(a + 2);
        } else {
        System.out.println(a + 1);
        }
        }

//Write a program that finds the tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).
//Take a look at the examples:
//If N is 264, the tens digit is 6.
//If N is 4136, the tens digit is 3.
//If N is 101, the tens digit is 0.
//Sample Input 1: 173       Sample Output 1: 7
        {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        a = a / 10;
        a = a % 10;

        System.out.println(a);
        }

//Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
//Sample Input 1: 476       Sample Output 1: 17
        {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = a / 10;
        int c = b % 10;
        int d = b / 10;

        a = a % 10 + d + c;

        System.out.println(a);

        }

//A university has decided to open math courses and equip classrooms for 3 groups with new special desks.
//The faculty agreed that for the sake of productivity, only two students may share one desk. The enrolment has ended, and now the task is to count
//the number of desks to order the correct number from the shop. Of course, the university is short of money, so you need to calculate the minimum
//number of desks. But don't forget that each group will sit in its own classroom!
//Input data format
//The program receives the input of the three non-negative integers: the number of students in each of the three groups
//(the numbers are not bigger than 1000).
//Sample Input 1: 20 21 22        Sample Output 1: 32
//Sample Input 2: 16 18 20        Sample Output 2: 27
                {
                Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                if (a % 2 == 0) {
                a = a / 2;
                } else {
                a = a / 2 + 1;
                }

                if (b % 2 == 0) {
                b = b / 2;
                } else {
                b = b / 2 + 1;
                }

                if (c % 2 == 0) {
                c = c / 2;
                } else {
                c = c / 2 + 1;
                }

                System.out.println(a + b + c);
                }