package level3;
import java.util.Scanner;

public class Numc_m3 {
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
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.contains("0");
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0, power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }
        return new int[]{max1, max2};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digitsArray = getDigitsArray(number);
        boolean isDuck = isDuckNumber(number);
        boolean isArmstrong = isArmstrongNumber(number);
        int[] largestValues = findLargestAndSecondLargest(digitsArray);
        int[] smallestValues = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("\n------ Number Analysis ------");
        System.out.println("Number: " + number);
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Digits: " + java.util.Arrays.toString(digitsArray));
        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));
        System.out.println("Armstrong Number: " + (isArmstrong ? "Yes" : "No"));
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + (largestValues[1] == Integer.MIN_VALUE ? "None" : largestValues[1]));
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + (smallestValues[1] == Integer.MAX_VALUE ? "None" : smallestValues[1]));

        scanner.close();
    }
}
