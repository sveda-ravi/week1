import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (must be a positive integer): ");
        int power = scanner.nextInt();

        // Validate input
        if (power < 0) {
            System.out.println("Please enter a positive integer for power.");
        } else {
            int result = 1; // Initialize result to 1

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Print the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}
