package level1;
import java.util.Scanner;
public class Tc_m1 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        return new double[]{sinValue, cosValue, tanValue};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.printf("\nSine(%.2f°) = %.4f", angle, trigValues[0]);
        System.out.printf("\nCosine(%.2f°) = %.4f", angle, trigValues[1]);
        if (Math.abs(trigValues[1]) < 1e-10) {
            System.out.println("\nTangent(" + angle + "°) is undefined.");
        } else {
            System.out.printf("\nTangent(%.2f°) = %.4f", angle, trigValues[2]);
        }
        scanner.close();
    }
}
