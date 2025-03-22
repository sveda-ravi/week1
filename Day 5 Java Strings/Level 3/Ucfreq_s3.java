package level3;
import java.util.Scanner;
public class Ucfreq_s3 {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static char[] getUniqueCharacters(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int index = 0;


        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean found = false;


            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }


            if (!found) {
                unique[index++] = ch;
            }
        }


        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }
    public static String[][] getFreqOfUniqueChars(String text) {
        int[] freq = new int[256];


        for (int i = 0; i < getLength(text); i++) {
            freq[text.charAt(i)]++;
        }


        char[] unique = getUniqueCharacters(text);
        String[][] result = new String[unique.length][2];


        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }


        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        String[][] output = getFreqOfUniqueChars(input);


        System.out.println("\nUnique Character Frequencies:");
        System.out.println("-----------------------------");
        System.out.println("Char\tFrequency");
        for (String[] row : output) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
