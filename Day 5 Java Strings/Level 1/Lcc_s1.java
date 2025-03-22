package level1;
import java.util.Scanner;

public class Lcc_s1{
    public static String toLowercaseManual(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        String lowerCaseBuiltIn = inputText.toLowerCase();
        String lowerCaseManual = toLowercaseManual(inputText);
        boolean isSame = compareStrings(lowerCaseBuiltIn, lowerCaseManual);
        System.out.println("\nUsing Built-in toLowerCase(): " + lowerCaseBuiltIn);
        System.out.println("Using Manual ASCII Conversion: " + lowerCaseManual);
        System.out.println("Are both results the same? " + (isSame ? "Yes" : "No"));

        scanner.close();
    }
}
