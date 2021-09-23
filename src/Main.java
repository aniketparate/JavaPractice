import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // var DataType can be used for any type of data
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();


        boolean day = (h1 <= h2 && h1 <= h3 && h2 <= h3) || (h1 >= h2 && h1 >= h3 && h2 >= h3);

        System.out.println(day);
    }
}