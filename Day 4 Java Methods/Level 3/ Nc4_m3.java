package level3;
import java.util.Scanner;

public class Nc4_m3 {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number;
    }
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is prime number: " + isPrime(number));
        System.out.println("Is neon number: " + isNeon(number));
        System.out.println("Is spy number: " + isSpyNumber(number));
        System.out.println("Is automorphic number: " + isAutomorphic(number));
        System.out.println("Is buzz number: " + isBuzzNumber(number));

        scanner.close();
    }
}
