import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Initialize count variable
        int count = 0;
        int originalNumber = number; // Store the original number

        // Step 3: Handle the case for 0 explicitly
        if (number == 0) {
            count = 1; // Zero has one digit
        } else {
            // Step 4: Count digits using a loop
            while (number != 0) {
                number /= 10; // Remove the last digit
                count++;       // Increase count
            }
        }

        // Step 5: Display the result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        scanner.close();
    }
}
