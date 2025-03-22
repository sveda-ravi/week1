import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();
        scanner.close();

        // Calculate area in square cm
        double areaCm = 0.5 * base * height;

        // Convert square cm to square inches (1 square inch = 6.4516 square cm)
        double areaInches = areaCm / 6.4516;

        // Convert height from cm to feet and inches
        double totalInches = height / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the results
        System.out.printf(
                "The area of the triangle is %.2f square cm and %.2f square inches.%n",
                areaCm, areaInches
        );
        System.out.printf(
                "Your height in cm is %.2f while in feet is %d and inches is %.2f%n",
                height, feet, inches
        );
    }
}
