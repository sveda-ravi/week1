import java.util.Scanner;

public class Dc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        scanner.close();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.printf("The distance in feet is %.2f, which is %.2f yards and %.6f miles.%n",
                distanceInFeet, distanceInYards, distanceInMiles);
    }
}
