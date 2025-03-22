import java.util.Scanner;

public class Td8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the total time taken (in hours): ");
        double timeTaken = scanner.nextDouble();
        scanner.close();

        // Calculating total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculating average speed
        double avgSpeed = totalDistance / timeTaken;

        // Displaying the results
        System.out.printf("\nTraveler: %s%n", name);
        System.out.printf("Journey: %s → %s → %s%n", fromCity, viaCity, toCity);
        System.out.printf("Total Distance: %.2f miles%n", totalDistance);
        System.out.printf("Time Taken: %.2f hours%n", timeTaken);
        System.out.printf("Average Speed: %.2f miles per hour%n", avgSpeed);
    }
}
