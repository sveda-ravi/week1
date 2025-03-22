import java.util.Scanner;

public class Rlf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input countdown start value
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        scanner.close();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff! 🚀");
    }
}
