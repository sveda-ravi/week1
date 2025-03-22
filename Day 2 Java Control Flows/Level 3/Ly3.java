import java.util.Scanner;

public class Ly3 {
    public static void checkLeapYear(int year) {

        if (year < 1582) {
            System.out.println(year + " is not within the Gregorian calendar (year >= 1582).");
            return;
        }


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }


        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year. (Using Logical Conditions)");
        } else {
            System.out.println(year + " is not a Leap Year. (Using Logical Conditions)");
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
