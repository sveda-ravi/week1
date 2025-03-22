package level2;
import java.util.Scanner;
public class Vci_s2 {
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    public static String[][] analyzeCharacters(String input) {
        int length = getStringLength(input);
        String[][] result = new String[length][2];


        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }


        return result;
    }
    public static void displayResult(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        String[][] result = analyzeCharacters(input);
        displayResult(result);
    }
}
