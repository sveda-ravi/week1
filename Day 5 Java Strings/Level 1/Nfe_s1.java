package level1;
import java.util.Scanner;

public class Nfe_s1 {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Converted Number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! Input must be a valid number.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scan.nextLine();
        scan.close();

        handleException(userInput);
    }
}
