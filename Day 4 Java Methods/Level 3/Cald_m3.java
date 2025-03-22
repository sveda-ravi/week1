package level3;
import java.util.Scanner;

public class Cald_m3 {
    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and year.");
            return;
        }

        displayCalendar(month, year);
        scanner.close();
    }
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + MONTHS[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // First day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
}
