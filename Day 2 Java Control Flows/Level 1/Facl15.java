import java.util.Scanner;

public class Facl15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();

        // Validate input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        // Compute factorial using for loop
        BigInteger factorial = 1;
        for (long i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print result
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
