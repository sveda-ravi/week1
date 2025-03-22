package level1;
import java.util.Scanner;

public class Hsc_m1 {
    public static int calculateHs(int n) {
        return (n * (n-1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int nos = scanner.nextInt();
        int handshakes = calculateHs(nos);

        System.out.println("Maximum number of Handshakes: " + handshakes);

        scanner.close();
    }
}
