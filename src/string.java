import java.util.Scanner;
//Write a program that reads two lines and compares them without whitespaces.
//The program should print true if both lines are equal, otherwise – false.
//Sample Input 1: "  string" "str ing"          Sample output 1: true
//Sample Input 2: "string" "my string"          Sample Output 2: false
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine().trim().replace(" ", "");
        String name2 = sc.nextLine().trim().replace(" ", "");

        System.out.println(name1.equals(name2));
    }
}

//Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
//The program should print out the resulting string
//Sample Input 1: aaa          Sample output 1: bbb
//Sample Input 2: bca          Sample Output 2: bcb
        {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();

        System.out.println(name1.replace('a', 'b'));
        }

//Write a program that reads the name of a city and checks if the name ends with "burg".
//Keep in mind, a city can have a short name.
//The program should output true or false.
//Sample Input 1: Augsburg                  Sample output 1: true
//Sample Input 2: Saint Petersburg          Sample Output 2: true
//Sample Input 3: Tu                        String Input 3: false
                {
                Scanner sc = new Scanner(System.in);

                String name1 = sc.nextLine();

                boolean name2 = name1.endsWith("burg");
                System.out.println(name2);
                }

//Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both.
//Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.
//Sample Input 1: Java  0 2           Sample output 1: jav
                {
                Scanner sc = new Scanner(System.in);

                String name1 = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();

                String name2 = name1.substring(a, b + 1);
                System.out.println(name2);
                }

//Write a program that checks if a given string starts with the prefix "J" ignoring the case.
//The program should output true or false.
//Sample Input 1: Java                  Sample output 1: true
//Sample Input 2: Kotlin                Sample Output 2: true
                {
                Scanner sc = new Scanner(System.in);

                String name1 = sc.next();

                System.out.println(name1.toLowerCase().charAt(0) == 'j');
                }