import java.util.Scanner;

public class Ssf11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        scanner.close();

        // Calculating the side of the square
        double side = perimeter / 4;

        // Displaying the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
    }
}
