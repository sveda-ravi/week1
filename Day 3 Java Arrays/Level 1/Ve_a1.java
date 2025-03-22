import java.util.Scanner;

public class Ve_a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = scanner.nextInt();
        }
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age!");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.ut.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}
