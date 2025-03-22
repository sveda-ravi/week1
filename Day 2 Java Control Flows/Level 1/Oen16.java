import java.util.Scanner;

public class Oen16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Validate input
        if (num < 1) {
            System.out.println("The number " + num + " is not a natural number");
            return;
        }

        // Iterate and print odd/even numbers
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
