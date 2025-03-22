import java.util.Scanner;

public class Eb17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        scanner.close();

        // Check if eligible for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: INR " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}
