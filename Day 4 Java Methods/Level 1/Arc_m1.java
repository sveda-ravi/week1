package level1;
import java.util.Scanner;

public class Arc_m1{
    public static int calculateRounds(double side1, double side2, double side3){
        double perimeter = side1 + side2+side3;
        double distanceRequired = 5000;
        return (int) Math.ceil(distanceRequired / perimeter);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side1 of the triangular park(in m): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the side2 of the triangular park(in m): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the side3 of the triangular park(in m): ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds+ "rounds to run 5km.");
        scanner.close();

    }


}