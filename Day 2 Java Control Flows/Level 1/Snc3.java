import java.util.Scanner;

public class Snc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        boolean is1Smallest = (num1 < num2 && num1 < num3);
        boolean is2Smallest = (num2 < num1 && num2 < num3);
        boolean is3Smallest = (num3 < num1 && num3 < num2);

        // Display output
        System.out.printf("Is the first number the smallest? %b%n", is1Smallest);
        System.out.printf("Is the second number the smallest? %b%n", is2Smallest);
        System.out.printf("Is the third number the smallest? %b%n", is3Smallest);



    }
}
