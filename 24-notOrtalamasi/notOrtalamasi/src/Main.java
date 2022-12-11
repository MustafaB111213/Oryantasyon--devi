import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vizeNotu;
        int finalNotu;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Vize notu giriniz :  ");
            vizeNotu = input.nextInt();
            System.out.println("Final notu giriniz : ");
            finalNotu = input.nextInt();

            double ortalama = vizeNotu * 40 / 100 + finalNotu * 60 / 100;

            System.out.println(ortalama);

            String sonuc = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
            System.out.println(sonuc);
        }
    }
}