package level2;
import java.util.Scanner;
public class Wla_s2 {
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
    public static String[] splitIntoWords(String text) {
        String[] words = new String[100];
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
    public static String[][] getWordLengths(String[] words) {
        String[][] wordInfo = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordInfo[i][0] = words[i];
            wordInfo[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordInfo;
    }
    public static int[] findShortestAndLongest(String[][] wordInfo) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.valueOf(wordInfo[0][1]);
        int maxLength = Integer.valueOf(wordInfo[0][1]);


        for (int i = 1; i < wordInfo.length; i++) {
            int length = Integer.valueOf(wordInfo[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[] {minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();


        String[] words = splitIntoWords(input);
        String[][] wordInfo = getWordLengths(words);
        int[] minMax = findShortestAndLongest(wordInfo);


        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] word : wordInfo) {
            System.out.println(word[0] + "\t\t" + Integer.valueOf(word[1]));
        }


        System.out.println("\nShortest Word: " + wordInfo[minMax[0]][0] +
                " (Length: " + wordInfo[minMax[0]][1] + ")");
        System.out.println("Longest Word: " + wordInfo[minMax[1]][0] +
                " (Length: " + wordInfo[minMax[1]][1] + ")");
    }
}
