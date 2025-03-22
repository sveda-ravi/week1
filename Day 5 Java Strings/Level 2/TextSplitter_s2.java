package level2;
import java.util.Scanner;
import java.util.Arrays;


public class TextSplitter_s2 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] customSplit(String str) {
        int length = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int wordStart = 0;
        int wordIndex = 0;




        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(wordStart, i);
                wordStart = i + 1;
                wordIndex++;
            }
        }
        words[wordIndex] = str.substring(wordStart, length);


        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        scanner.close();
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean areEqual = compareArrays(customWords, builtInWords);


        System.out.println("\nCustom split result: " + Arrays.toString(customWords));
        System.out.println("Built-in split() result: " + Arrays.toString(builtInWords));
        System.out.println("Are both methods producing the same result? " + areEqual);
    }
}
