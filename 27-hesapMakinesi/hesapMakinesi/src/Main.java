import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;

        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");

        while (true) {

            System.out.println("Lütfen seçim yapınız: ");

            int secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("ilk sayıyı gir");
                    sayi1 = input.nextDouble();
                    System.out.println("ikinci sayıyı gir");
                    sayi2 = input.nextDouble();
                    System.out.println(sayi1 + sayi2);
                    break;
                case 2:
                    System.out.println("ilk sayıyı gir");
                    sayi1 = input.nextDouble();
                    System.out.println("ikinci sayıyı gir");
                    sayi2 = input.nextDouble();
                    System.out.println(sayi1 - sayi2);
                    break;
                case 3:
                    System.out.println("ilksayıyı gir");
                    sayi1 = input.nextDouble();
                    System.out.println("ikinci sayıyı gir");
                    sayi2 = input.nextDouble();
                    System.out.println(sayi1 * sayi2);
                    break;
                case 4:
                    System.out.println("ilk sayıyı gir");
                    sayi1 = input.nextDouble();
                    System.out.println("ikinci sayıyı gir");
                    sayi2 = input.nextDouble();
                    if (sayi2 == 0) {
                        System.out.println("tanımsız");
                    } else {
                        System.out.println(sayi1 / sayi2);

                    }
                    System.out.println("ikinci sayıyı gir");
                    break;
                default:
                    System.out.println("Yanlış seçim");
            }
        }
    }

}

