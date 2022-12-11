import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean n = true;

        while (n == true) {
            System.out.print("Sayı giriniz : ");
            int sayi = scanner.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Çift sayıdır");
                n = false;
            } else {
                System.out.println("Tek sayıdır.");
            }
        }
    }
}

