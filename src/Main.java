public class Main {
    public static void main(String[] args) {

        int a = 1;

        for(;a <= 100;a++){
            if(a % 3 == 0 && a % 5 == 0){
                System.out.println("HELLO WORLD");
            } else if (a % 5 == 0){
                System.out.println("WORLD");
            } else if (a % 3 == 0){
                System.out.println("HELLO");
            } else {
                System.out.println(+a);
            }
        }
    }
}