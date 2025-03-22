import java.util.Scanner;

public class Cd10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of chocolates and children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        scanner.close();

        // Calculating chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Displaying the result
        System.out.printf("The number of chocolates each child gets is %d, and the number of remaining chocolates is %d.%n",
                chocolatesPerChild, remainingChocolates);
    }
}
