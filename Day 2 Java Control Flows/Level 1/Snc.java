import java.util.Scanner;

public class Snc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        boolean isSmallest = (num1 < num2 && num1 < num3);

        // Display output
        System.out.printf("Is the first number the smallest? %b%n", isSmallest);

    }
}
