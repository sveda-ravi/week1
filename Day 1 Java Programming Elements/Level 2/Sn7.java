import java.util.Scanner;

public class Sn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Displaying the swapped numbers
        System.out.printf("The swapped numbers are %d and %d.%n", number1, number2);
    }
}
