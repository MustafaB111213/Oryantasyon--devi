import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int total = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                total = total + i;
            }

        }
        System.out.println(total);
        if (total == x) {
            System.out.println(x + " Mükemmel sayıdır");
        }
        else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}