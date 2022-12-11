import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz:");
        char harf = scanner.next().charAt(0);
        switch (harf){
            case 'a':
            case 'u':
            case 'o':
            case 'ı':
                System.out.println("kalın harf girdiniz");
                break;
            case 'e':
            case 'i':
            case 'ü':
            case 'ö':
                System.out.println("İnce harf girdiniz");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz");
        }
    }
}