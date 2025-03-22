package level2;
import java.util.Scanner;
public class Svc_m2 {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for Student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        System.out.println("--------------------------------");
        System.out.println("Student | Age | Can Vote?");
        System.out.println("--------------------------------");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            String result = (studentAges[i] < 0) ? "Invalid Age" : (canVote ? "Yes" : "No");
            System.out.printf("   %2d    |  %2d  |   %s\n", (i + 1), studentAges[i], result);
        }
        scanner.close();
    }
}
