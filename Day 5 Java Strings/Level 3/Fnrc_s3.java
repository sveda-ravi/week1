package level3;
import java.util.Scanner;
public class Fnrc_s3 {
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }


        return '-';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();


        char result = findFirstNonRepeating(text);
        if (result == '-') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
