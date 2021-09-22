import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // var DataType can be used for any type of data
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 3_431_231;

        boolean value = ((a < b || a > c) && (a < c || a > b)) || (a == b);
        System.out.println(value);
        System.out.println(c);
        System.out.println(d);
    }
}