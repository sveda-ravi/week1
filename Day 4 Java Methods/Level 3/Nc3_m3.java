package level3;
import java.util.Arrays;
import java.util.Scanner;

public class Nc3_m3 {
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
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        return compareArrays(digits, reverseDigits(digits));
    }
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Is palindrome: " + isPalindrome(number));
        System.out.println("Is duck number: " + isDuckNumber(number));

        scanner.close();
    }
}
