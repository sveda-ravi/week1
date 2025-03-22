import java.util.Scanner;

public class Tc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();

        // Converting Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Displaying the result
        System.out.printf("The %.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsius);
    }
}
