import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaricap;
        double pi = 3.14;
        double cevre;
        double alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        yaricap = input.nextDouble();
        cevre = pi*2*yaricap;
        alan = pi*yaricap*yaricap;

        System.out.println("Dairenin çevresi = "+ cevre);
        System.out.println("Dairenin alanı = "+ alan);


    }
}