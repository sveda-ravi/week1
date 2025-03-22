package level2;
import java.util.Scanner;

public class Rn_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input! Please enter a non-negative number.");
            return;
        }

        int temp = number, count = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
