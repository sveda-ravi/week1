package level2;
import java.util.Scanner;

public class Sg2d_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();


        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        String[] remarks = new String[numStudents];


        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = scanner.nextInt();

                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid input! Marks should be between 0 and 100. Please enter again.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }


        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;


            if (percentages[i] >= 90) {
                grades[i] = 'A';
                remarks[i] = "Excellent";
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
                remarks[i] = "Very Good";
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
                remarks[i] = "Good";
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
                remarks[i] = "Average";
            } else {
                grades[i] = 'F';
                remarks[i] = "Fail";
            }
        }
        System.out.println("\nStudent Report:");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Student |  Grade  |    Remarks     |   Percentage  |   Marks (P,C,M)");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("   %d    |    %c    |  %-12s  |    %.2f%%     |   %3d, %3d, %3d \n",
                    (i + 1), grades[i], remarks[i], percentages[i], marks[i][0], marks[i][1], marks[i][2]);
        }

        scanner.close();
    }
}
