import java.util.Scanner;

public class Bmi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();


        double heightM = heightCm / 100.0;


        double bmi = weight / (heightM * heightM);


        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {  // bmi >= 40.0
            status = "Obese";
        }


        System.out.printf("\nYour BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
