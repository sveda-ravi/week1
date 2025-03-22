import java.util.Scanner;

public class Tic6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for salary and bonus
        System.out.print("Enter the salary in INR: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the bonus in INR: ");
        double bonus = scanner.nextDouble();
        scanner.close();

        // Calculating total income
        double totalIncome = salary + bonus;

        // Displaying the result
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence, Total Income is INR %.2f.%n",
                salary, bonus, totalIncome);
    }
}
