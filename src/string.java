import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine().trim().replace(" ", "");
        String name2 = sc.nextLine().trim().replace(" ", "");

        System.out.println(name1.equals(name2));
    }
}