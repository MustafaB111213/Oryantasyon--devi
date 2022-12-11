import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kenar1,kenar2,kenar3;
        kenar1 = sc.nextDouble();
        kenar2 = sc.nextDouble();
        kenar3 = sc.nextDouble();
        if ((kenar3-kenar1)<kenar2 && kenar1+kenar3>kenar2){
            if (kenar3-kenar1<0){
                double p =kenar3-kenar1;
                p = p*-1;
            }
            System.out.println("Bu bir üçgendir.");
        } else  {
            System.out.println("Bu bir üçgen değildir");
        }
    }
}