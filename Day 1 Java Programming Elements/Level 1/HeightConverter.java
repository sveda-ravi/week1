import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter your height in cm: ");
        double cm = scanner.nextDouble();
        scanner.close();

        // Convert cm to inches
        double totalInches = cm / 2.54;

        // Convert inches to feet and inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the result in the desired format
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f%n", cm, feet, inches);
    }
}
