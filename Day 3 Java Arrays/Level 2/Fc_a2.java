package level2;
import java.util.Scanner;

public class Fc_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            age[i] = scanner.nextInt();

            System.out.println("Enter height of " + friends[i] + " (in cm): ");
            height[i] = scanner.nextDouble();
        }

        // Finding youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Finding tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);

        scanner.close();
    }
}
