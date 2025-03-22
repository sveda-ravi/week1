import java.util.Scanner;

public class Suz11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double num = scanner.nextDouble();
            if (num == 0) {
                break;
            }
            total += num;
        }
        scanner.close();
        System.out.println("Total sum: " + total);
    }
}
