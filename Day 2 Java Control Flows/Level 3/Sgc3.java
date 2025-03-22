import java.util.Scanner;

public class Sgc3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Mathematics: ");
        int math = scanner.nextInt();

        int totalMarks = physics+chemistry+math;
        double percentage = totalMarks / 3.0;

        String grade, remarks;
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Satisfactory";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("\n--- Result Summary ---");
        System.out.println("Grade\t\tRemarks\t\t\tMarks");
        System.out.println(grade + "\t\t" + remarks + "\t\t" + String.format("%.2f", percentage) + "%");

        scanner.close();

    }

}
