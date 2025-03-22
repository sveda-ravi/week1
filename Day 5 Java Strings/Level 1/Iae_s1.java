package level1;
import java.util.Scanner;

public class Iae_s1{

    public static void generateException(String str) {
        System.out.println("Invalid substring: " + str.substring(5, 2));
    }
    public static void handleException(String str) {
        try {
            System.out.println("Invalid substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException! Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught a general RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();
        handleException(userInput);
    }
}
