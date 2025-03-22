package level2;
import java.util.Scanner;

public class Na_m2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last element: ");
        if (result == 1) {
            System.out.println("First number is greater.");
        } else if (result == -1) {
            System.out.println("Last number is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
}
