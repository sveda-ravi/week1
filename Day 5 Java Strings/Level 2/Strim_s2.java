package level2;
import java.util.Scanner;
public class Strim_s2 {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static int[] findTrimIndices(String str) {
        int start = 0, end = getLength(str) - 1;


        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }


        return new int[]{start, end};
    }
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (getLength(a) != getLength(b)) return false;
        for (int i = 0; i < getLength(a); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();


        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();


        System.out.println("\nTrimmed using custom method: [" + trimmedCustom + "]");
        System.out.println("Trimmed using built-in method: [" + trimmedBuiltIn + "]");
        System.out.println("Are both equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
