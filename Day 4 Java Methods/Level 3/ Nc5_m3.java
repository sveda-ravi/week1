package level3;
import java.util.Scanner;

public class Nc5_m3 {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2];
    }
    public static int findSumOfFactors(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long findProductOfFactors(int number) {
        long product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static long findProductOfCubesOfFactors(int number) {
        long product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number) {
        int sum = findSumOfFactors(number) - number;
        return sum == number;
    }
    public static boolean isAbundantNumber(int number) {
        int sum = findSumOfFactors(number) - number;
        return sum > number;
    }
    public static boolean isDeficientNumber(int number) {
        int sum = findSumOfFactors(number) - number;
        return sum < number;
    }
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(number));
        System.out.println("Sum of Factors: " + findSumOfFactors(number));
        System.out.println("Product of Factors: " + findProductOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubesOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        scanner.close();
    }
}
