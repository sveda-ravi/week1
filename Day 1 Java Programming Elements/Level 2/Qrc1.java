import java.util.Scanner;

public class Qrc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter the first number (dividend): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = scanner.nextInt();
        scanner.close();

        // Checking if divisor is zero to prevent division by zero error
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Displaying the result
            System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d.%n",
                    quotient, remainder, number1, number2);
        }
    }
}
