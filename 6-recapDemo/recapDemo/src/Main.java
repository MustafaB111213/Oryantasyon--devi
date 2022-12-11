import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        System.out.println("lütfen ilk sayıyı giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.println("lütfen ilk sayıyı giriniz : ");
        sayi2 = scanner.nextInt();
        System.out.println("lütfen ilk sayıyı giriniz : ");
        sayi3 = scanner.nextInt();
        int enBuyukSayi = sayi1;
        if (enBuyukSayi < sayi2){
            enBuyukSayi = sayi2;
        }
        if (enBuyukSayi < sayi3){
            enBuyukSayi = sayi3;
        }
        System.out.println("En büyük sayı = " + enBuyukSayi);

    }

}