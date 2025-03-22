import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        // Validate input
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Looping backward from 99 to 1
            for (int i = 99; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Move to the next line after printing all multiples
        } else {
            System.out.println("Please enter a valid positive integer less than 100.");
        }

        scanner.close();
    }
}
