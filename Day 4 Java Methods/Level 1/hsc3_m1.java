package level1;
import java.util.Scanner;
public class hsc3_m1 {
    public static int calhs(int n){
        return (n*(n-1))/2;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of students: ");
        int numberOfStudents = scanner.nextInt();
        int handshakes = calhs(numberOfStudents);

        System.out.println("Maximum number of Handshakes: " + handshakes);
        scanner.close();
    }
}
