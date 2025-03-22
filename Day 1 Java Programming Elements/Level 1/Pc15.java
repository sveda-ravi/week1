import java.util.Scanner;

public class Pc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for unit price and quantity
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        scanner.close();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n",
                totalPrice, quantity, unitPrice);
    }
}
