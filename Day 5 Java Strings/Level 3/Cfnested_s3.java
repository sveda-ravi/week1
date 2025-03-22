package level3;
import java.util.Scanner;
public class Cfnested_s3 {
    public static String[] findCharFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];


        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] != '0') {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }


        // Prepare result
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }


        String[] result = new String[count];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[k++] = chars[i] + " -> " + freq[i];
            }
        }


        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();


        String[] output = findCharFrequencies(input);


        System.out.println("\nCharacter Frequencies:");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
