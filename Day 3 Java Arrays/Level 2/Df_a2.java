package level2;
import java.util.Scanner;

public class Df_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            return;
        }

        int[] frequency = new int[10];


        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            frequency[digit]++;
            tempNumber /= 10;
        }


        System.out.println("\nDigit | Frequency");
        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("  " + i + "   |    " + frequency[i]);
            }
        }

        scanner.close();
    }
}
