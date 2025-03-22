import java.util.Scanner;

public class Fac14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
