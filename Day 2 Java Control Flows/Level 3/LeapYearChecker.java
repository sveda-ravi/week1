import java.util.Scanner;

public class LeapYearChecker {
    public static void checkLeapYear(int year) {
        // Ensure the year is within the Gregorian calendar
        if (year < 1582) {
            System.out.println(year + " is not within the Gregorian calendar (year >= 1582).");
            return;
        }

        // Using a single if condition with logical operators
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        checkLeapYear(year);
        scanner.close();
    }
}
