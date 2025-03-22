package level3;
import java.util.Random;
import java.util.Scanner;

public class Ssc_m3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        int[][] studentScores = generateStudentScores(numStudents);
        double[][] studentResults = calculateStudentResults(studentScores);
        displayStudentScorecard(studentScores, studentResults);

        scanner.close();
    }
    public static int[][] generateStudentScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101);
            scores[i][1] = rand.nextInt(101);
            scores[i][2] = rand.nextInt(101);
        }
        return scores;
    }
    public static double[][] calculateStudentResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static void displayStudentScorecard(int[][] scores, double[][] results) {
        System.out.println("\nID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
}
