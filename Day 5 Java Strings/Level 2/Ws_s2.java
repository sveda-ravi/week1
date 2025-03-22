package level2;
import java.util.Scanner;
public class Ws_s2 {
    public static String[] splitIntoWords(String text) {
        String[] words = new String[100]; // assume max 100 words
        int wordCount = 0;
        String currentWord = "";


        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words[wordCount++] = currentWord;
                    currentWord = "";
                }
            }
        }
        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord;
        }
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
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
    public static String[][] getWordLengths(String[] words) {
        String[][] wordInfo = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordInfo[i][0] = words[i];
            wordInfo[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordInfo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();


        String[] words = splitIntoWords(input);
        String[][] result = getWordLengths(words);


        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.valueOf(result[i][1]);
            System.out.println(word + "\t\t" + length);
        }
    }
}
