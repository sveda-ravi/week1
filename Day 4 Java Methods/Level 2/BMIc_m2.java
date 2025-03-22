package level2;
import java.util.Scanner;

public class BMIc_m2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] persons = new double[10][3];
        String[] statuses = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = scanner.nextDouble();
        }
        calculateBMI(persons);
        statuses = determineBMIStatus(persons);
        System.out.println("\n---------------- BMI Report ----------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", persons[i][0], persons[i][1], persons[i][2], statuses[i]);
        }

        scanner.close();
    }
    public static void calculateBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {
            double heightInMeters = persons[i][1] / 100;
            persons[i][2] = persons[i][0] / (heightInMeters * heightInMeters);
        }
    }
    public static String[] determineBMIStatus(double[][] persons) {
        String[] statuses = new String[persons.length];

        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];

            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
