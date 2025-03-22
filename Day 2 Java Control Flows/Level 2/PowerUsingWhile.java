import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for base and exponent
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        // Validate that power is non-negative
        if (power < 0) {
            System.out.println("Invalid input! Power must be a non-negative integer.");
        } else {
            int result = 1; // Initialize result to 1
            int counter = 0; // Counter for loop

            // While loop to calculate power
            while (counter < power) {
                result *= number; // Multiply result by number
                counter++; // Increment counter
            }

            // Print final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}
