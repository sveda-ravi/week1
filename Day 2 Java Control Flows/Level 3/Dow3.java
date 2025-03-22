import java.util.Scanner;

public class Dow3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;
        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;


        int dayOfWeek = (h + 5) % 7;


        System.out.println("Day of the week: " + dayOfWeek);

        scanner.close();
    }
}
