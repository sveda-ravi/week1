package level2;
import java.util.Scanner;

public class Ld_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDigits = 10;

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            return;
        }

        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract digits
        while (number > 0 && index < maxDigits) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }


        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }


        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "Not available" : secondLargest));

        scanner.close();
    }
}
