package level2;
import java.util.Scanner;

public class Son_m2{
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumRecursive(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return;
        }
        int sumRec = sumRecursive(n);
        int sumFormula = sumUsingFormula(n);
        System.out.println("\nSum of first " + n + " natural numbers using recursion: " + sumRec);
        System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);
        if (sumRec == sumFormula) {
            System.out.println("\n Both methods give the same correct result!");
        } else {
            System.out.println("\n Mismatch! There might be an error in calculations.");
        }

        scanner.close();
    }
}
