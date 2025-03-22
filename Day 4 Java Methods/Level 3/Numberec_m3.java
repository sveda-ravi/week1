package level3;
import java.util.Scanner;

public class Numberec_m3 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0; // Harshad number condition
    }
    public static int[][] findDigitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i;
        }
        for (int digit : digits) {
            frequencyArray[digit][1]++;
        }

        return frequencyArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digitsArray = getDigitsArray(number);
        int sumDigits = sumOfDigits(digitsArray);
        int sumSquares = sumOfSquares(digitsArray);
        boolean isHarshad = isHarshadNumber(number);
        int[][] frequencyArray = findDigitFrequency(number);
        System.out.println("\n------ Number Analysis ------");
        System.out.println("Number: " + number);
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Digits: " + java.util.Arrays.toString(digitsArray));
        System.out.println("Sum of Digits: " + sumDigits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);
        System.out.println("Harshad Number: " + (isHarshad ? "Yes" : "No"));
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequencyArray[i][1] > 0) {
                System.out.println("Digit " + frequencyArray[i][0] + ": " + frequencyArray[i][1] + " times");
            }
        }

        scanner.close();
    }
}
