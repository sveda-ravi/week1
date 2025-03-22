import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number (positive integer less than 100): ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            int counter = 100 - 1; // Start from 99

            // While loop to find multiples
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--; // Decrement counter
            }
        }

        scanner.close();
    }
}
