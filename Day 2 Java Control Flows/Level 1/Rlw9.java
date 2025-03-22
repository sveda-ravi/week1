import java.util.Scanner;

public class Rlw9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input countdown start value
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        scanner.close();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff! 🚀");
    }
}
