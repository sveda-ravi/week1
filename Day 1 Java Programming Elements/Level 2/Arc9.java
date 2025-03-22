import java.util.Scanner;

public class Arc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the three sides of the triangular park in meters
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        scanner.close();

        // Calculating the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance to run (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculating the number of rounds required
        double rounds = totalDistance / perimeter;

        // Displaying the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);
    }
}
