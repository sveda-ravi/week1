package level1;
import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] heights = new double[11];
        double sum = 0;


        System.out.println("Enter the heights (in cm) of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }


        double mean = sum / 11;


        System.out.printf("\nThe mean height of the football team is: %.2f cm\n", mean);

        scanner.close();
    }
}
