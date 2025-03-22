package level3;
import java.util.Scanner;
public class Pc_s3 {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;


        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeByReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];


        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }


        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }


        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();


        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeByReverse(text);


        System.out.println("\nPalindrome Check:");
        System.out.println("Logic 1 (Iterative): " + result1);
        System.out.println("Logic 2 (Recursive): " + result2);
        System.out.println("Logic 3 (Reverse Compare): " + result3);
    }
}
