package level1;
import java.util.Scanner;

public class Ucc_s1 {
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String userInput = scanner.nextLine();

        scanner.close();
        String manuallyConverted = convertToUppercase(userInput);
        String builtInUppercase = userInput.toUpperCase();
        boolean isEqual = compareStrings(manuallyConverted, builtInUppercase);
        System.out.println("\nManual Uppercase Conversion: " + manuallyConverted);
        System.out.println("Built-in toUpperCase() Output: " + builtInUppercase);
        System.out.println("Are both outputs identical? " + isEqual);
    }
}
