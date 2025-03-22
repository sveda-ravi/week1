package level3;
import java.util.Random;
import java.util.Scanner;

public class Zbass_m3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Zara Employee Bonus Calculation ===");
        double[][] employees = generateEmployeeData(10);
        double[][] updatedSalaries = calculateNewSalaryAndBonus(employees);
        displayEmployeeBonus(updatedSalaries);
        System.out.println("\n=== Student Scorecard Calculation ===");
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] studentScores = generateStudentScores(numStudents);
        double[][] studentResults = calculateStudentResults(studentScores);
        displayStudentScorecard(studentScores, studentResults);

        scanner.close();
    }
    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] data = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] employees) {
        double[][] newSalaries = new double[employees.length][4];
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonus = (years > 5) ? (0.05 * salary) : (0.02 * salary);
            double newSalary = salary + bonus;

            newSalaries[i][0] = salary;
            newSalaries[i][1] = years;
            newSalaries[i][2] = bonus;
            newSalaries[i][3] = newSalary;

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.printf("\nTotal Old Salary: %.2f | Total New Salary: %.2f | Total Bonus Paid: %.2f\n",
                totalOldSalary, totalNewSalary, totalBonus);

        return newSalaries;
    }
    public static void displayEmployeeBonus(double[][] updatedSalaries) {
        System.out.println("\nID\tOld Salary\tYears of Service\tBonus\tNew Salary");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < updatedSalaries.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.0f\t\t\t%.2f\t%.2f\n",
                    i + 1, updatedSalaries[i][0], updatedSalaries[i][1], updatedSalaries[i][2], updatedSalaries[i][3]);
        }
    }
    public static int[][] generateStudentScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101);
            scores[i][1] = rand.nextInt(101);
            scores[i][2] = rand.nextInt(101);
        }
        return scores;
    }
    public static double[][] calculateStudentResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static void displayStudentScorecard(int[][] scores, double[][] results) {
        System.out.println("\nID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
}
