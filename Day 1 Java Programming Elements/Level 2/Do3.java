import java.util.Scanner;

public class Do3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a, b, and c as double values
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        scanner.close();

        // Performing double operations while considering operator precedence
        double result1 = a + b * c; // Multiplication (*) has higher precedence than Addition (+)
        double result2 = a * b + c; // Multiplication (*) has higher precedence than Addition (+)
        double result3 = c + a / b; // Division (/) has higher precedence than Addition (+)
        double result4 = a % b + c; // Modulus (%) has higher precedence than Addition (+)

        // Displaying the results
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f.%n",
                result1, result2, result3, result4);
    }
}
