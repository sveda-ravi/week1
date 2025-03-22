package level2;
import java.util.Scanner;

public class Bmi_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Height (m): ");
            height[i] = scanner.nextDouble();

            System.out.print("Weight (kg): ");
            weight[i] = scanner.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Results:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", height[i], weight[i], bmi[i], weightStatus[i]);
        }

        scanner.close();
    }
}
