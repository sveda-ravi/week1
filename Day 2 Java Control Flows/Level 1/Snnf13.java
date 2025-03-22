import java.util.Scanner;

public class Snnf13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Validate input
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }

        // Compute sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Compute sum using for loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }

        // Display results
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using for loop: " + sumLoop);
        System.out.println("Are both results equal? " + (sumFormula == sumLoop));
    }
}
