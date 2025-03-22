import java.util.Scanner;

public class Na_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        System.out.println("\nNumber Analysis:");
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }


        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of First and Last Element:");
        if (first > last) {
            System.out.println("First element " + first + " is greater than last element " + last);
        } else if (first < last) {
            System.out.println("First element " + first + " is less than last element " + last);
        } else {
            System.out.println("First element " + first + " is equal to last element " + last);
        }

        scanner.close();
    }
}
