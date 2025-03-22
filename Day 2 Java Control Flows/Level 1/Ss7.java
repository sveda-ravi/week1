import java.util.Scanner;

public class Ss7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month and day
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        scanner.close();

        // Check if it's spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
