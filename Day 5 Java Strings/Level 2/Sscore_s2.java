package level2;
import java.util.*;
public class Sscore_s2 {
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 41) + 60;
            }
        }
        return marks;
    }
    public static double[][] calculateScores(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }
    public static String[] assignGrades(double[][] scores) {
        String[] grades = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            double percent = scores[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void displayScorecard(int[][] marks, double[][] scores, String[] grades) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAvg\t%age\tGrade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] +
                    "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + grades[i]);
        }
    }
    public static void main(String[] args) {
        int numberOfStudents = 10;


        int[][] marks = generateMarks(numberOfStudents);
        double[][] scores = calculateScores(marks);
        String[] grades = assignGrades(scores);


        displayScorecard(marks, scores, grades);
    }
}
