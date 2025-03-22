import java.util.Scanner;

public class Hsc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.close();

        // Calculating the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.printf("The maximum number of possible handshakes among %d students is %d.%n",
                numberOfStudents, maxHandshakes);
    }
}
