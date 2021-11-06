import java.util.Scanner;

/*
Your task is to find the roots of a cubic equation. The input contains four numbers: a,b,c,d a, b, c, d a,b,c,d.
Output all the integer roots between 0 and 1000 (inclusive) for the equation ax3+bx2+cx+d=0 ax^3+bx^2+cx+d=0 ax3+bx2+cx+d=0 in ascending order.
If the specified interval does not contain the roots of the equation, do not output anything. Remember, that cubic
equation always has 3 roots, meaning it can't have more than 3 integer roots. Keep this in mind in order to optimize the code.
 Sample Input 1:  -1  1  -1  1
 Sample Output 1:  1
 Sample Input 2:  0  1  -6  5
 Sample Output 2:  1  5
 Sample Input 3:  1  1  1  1
 Sample Output 3:
 */
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int range = 1000;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 0; i <= range; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}

/*
Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.
In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5.
They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D.
The program gets number n as input and then gets the grades themselves: one by one.
The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.
 Sample Input 1:  13  2  5  5  5  5  3  2  4  3  3  3  2  3
 Sample Output 1:  3 5 1 4
 */
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int gradeA = 5;
        final int gradeB = 4;
        final int gradeC = 3;
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < n; i++) {
            int grades = sc.nextInt();

            if (grades == gradeA) {
                a++;
            } else if (grades == gradeB) {
                b++;
            } else if (grades == gradeC) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}


/*
Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
Note: it is possible to write this program more efficiently without any loops.
 Sample Input 1:  10 20 10
 Sample Output 1:  2
 Sample Input 2:  15 25 5
 Sample Output 2:  3
 */
class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
A detector compares the size of parts produced by a machine with the reference standard.
If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
The program should output numbers in a single line containing the number of parts ready to be shipped,
the number of parts to be fixed, and the number of rejects.
 Sample Input 1:  14  0  -1  -1  1  0  0  0  0  0  1  0  -1  1  -1
 Sample Output 1:  7 3 4
 */
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int gradeA = 1;
        final int gradeB = -1;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < n; i++) {
            int parts = sc.nextInt();

            if (parts == gradeA) {
                a++;
            } else if (parts == gradeB) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println(c + " " + a + " " + b);
    }
}

/*
Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.
It is guaranteed, that there is always a number divisible by 6 in the sequence.
 Sample Input 1:  8  11  12  68  6  98  81  36  86
 Sample Output 1:  54
 */
class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int no = 6;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % no == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}

/*
Print the sum of all integers from a to b including both. It is guaranteed that a < b in all test cases.
 Sample Input 1:  3  22
 Sample Output 1:  250
 */
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

/*
Fizz Buzz is a classic programming problem. Here is its slightly modified version.
Write a program that takes two integers as the input: the beginning and the end of the interval (both numbers belong to the interval).
The program should output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it;
if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.
Output each number or the word on a separate line.
 Sample Input 1:  8 16
Sample Output 1:  8  Fizz  Buzz  11  Fizz  13  14  FizzBuzz  16
 */
class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int num = 3;
        final int num1 = 5;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % num == 0 && i % num1 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % num == 0) {
                System.out.println("Fizz");
            } else if (i % num1 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

/*
Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.
As input, the program receives the number of elements in the sequence n (first line) and then the elements themselves (next n lines).
The program should print a single number: the maximum element of the sequence divisible by 4.
Try to solve this problem by using a for-loop.
 Sample Input 1:  12  16  87  58  25  73  86  36  79  40  12  89  32
 Sample Output 1  40
 */
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int no = 4;
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % no == 0) {
                a = num;
                a = a / no;
                if (a > b) {
                    b = a;
                }
            }
        }
        System.out.println(b * no);
    }
}

/*
Write a program that reads two numbers a a a and b b b from the keyboard and calculates and outputs to the console
the arithmetic average of all numbers from the interval [a;b] [a; b] [a;b], which are divisible by 3 3 3.
In the example below, the arithmetic average is calculated for the numbers on the interval [−5;12] [-5; 12] [−5;12].
On this interval, there are 6 6 6 numbers divisible by 3 3 3, namely: −3,0,3,6,9,12 -3, 0, 3, 6, 9, 12 −3,0,3,6,9,12.
Their arithmetic average equals 4.5 4.5 4.5. The program input contains intervals, which always contain at least one number,
which is divisible by 3 3 3.
Remember that the int type cannot contain fractions. Use a double variable to store the precise result of the division.
 Sample Input 1:  -5  12
 Sample Output 1:  4.5
 */
class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int no = 3;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        double sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % no == 0) {
                sum += i;
                count++;
            }
        }
        sum = sum / count;
        System.out.println(sum);
    }
}

/*
Write a program that prints the product of all integer numbers from a to b (a < b). Include a and exclude b from the product.
 Sample Input 1:  1 2
 Sample Output 1:  1
 Sample Input 2:  100 105
 Sample Output 2:  11035502400
 */
class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long mult = 1;
        for (int i = a; i < b; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
}