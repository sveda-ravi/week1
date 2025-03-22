import java.util.Scanner;

public class Wc12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        scanner.close();

        // Converting pounds to kilograms
        double weightInKg = weightInPounds / 2.2;

        // Displaying the result
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f.%n",
                weightInPounds, weightInKg);
    }
}
