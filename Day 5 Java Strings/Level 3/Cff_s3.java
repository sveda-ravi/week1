package level3;
import java.util.Scanner;
public class Cff_s3 {
    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256];
        boolean[] counted = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        String[][] result = new String[text.length()][2];
        int index = 0;


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!counted[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                counted[ch] = true;
                index++;
            }
        }
        String[][] trimmed = new String[index][2];
        for (int i = 0; i < index; i++) {
            trimmed[i][0] = result[i][0];
            trimmed[i][1] = result[i][1];
        }


        return trimmed;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        String[][] frequencies = getCharFrequency(input);


        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------");
        System.out.println("Char\tFrequency");
        for (String[] row : frequencies) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
