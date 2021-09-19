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

        for (int a = 0; b < H;) {
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