import java.util.Scanner;

public class Intop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();
        scanner.close();

        // Performing integer operations while considering operator precedence
        int result1 = a + b * c; // Multiplication (*) has higher precedence than Addition (+)
        int result2 = a * b + c; // Multiplication (*) has higher precedence than Addition (+)
        int result3 = c + a / b; // Division (/) has higher precedence than Addition (+)
        int result4 = a % b + c; // Modulus (%) has higher precedence than Addition (+)

        // Displaying the results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d.%n",
                result1, result2, result3, result4);
    }
}
