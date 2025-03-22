import java.util.Scanner;

public class Tc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        // Converting Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Displaying the result
        System.out.printf("The %.2f Celsius is %.2f Fahrenheit.%n", celsius, fahrenheit);
    }
}
