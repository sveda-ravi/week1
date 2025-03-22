package level2;
import java.util.Scanner;

public class Eb_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEES = 10;

        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];
        double[] bonusAmount = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;


        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter salary of Employee " + (i + 1) + ": ");
            salary[i] = scanner.nextDouble();

            System.out.println("Enter years of service for Employee " + (i + 1) + ": ");
            yearsOfService[i] = scanner.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // Repeat input for this employee
                continue;
            }


            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonusAmount[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        System.out.println("\nTotal Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);

        scanner.close();
    }
}
