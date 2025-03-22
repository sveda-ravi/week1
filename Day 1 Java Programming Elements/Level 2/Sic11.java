import java.util.Scanner;

public class Sic11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount (INR): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();
        scanner.close();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.printf("The Simple Interest is INR %.2f for Principal INR %.2f, Rate of Interest %.2f%%, and Time %.2f years.%n",
                simpleInterest, principal, rate, time);
    }
}
