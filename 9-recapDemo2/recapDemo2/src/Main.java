import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double[] myList = new double[5];
        for (int i = 0 ; i<5 ; i ++ ){
            myList[i] = scanner.nextDouble();
        }
        double total = 0;
        double max = myList[0];

        for (double numbers : myList) {
            if (max < numbers) {
                max = numbers;
            }
            total = total + numbers;
            System.out.println(numbers);

        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);
    }
}