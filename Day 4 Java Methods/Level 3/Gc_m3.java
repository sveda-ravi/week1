package level3;
import java.util.Scanner;

public class Gc_m3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        System.out.print("\nEnter x3 and y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        boolean collinearSlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Slope Method): " + collinearSlope);
        boolean collinearArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Area Method): " + collinearArea);

        scanner.close();
    }
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return new double[]{m, b};
    }
    public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
