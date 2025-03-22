package level1;
import java.util.Scanner;

public class Cd_m1 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int[] result = new int[2];
        result[0] = chocolates / children;
        result[1] = chocolates % children;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();
        if (children == 0) {
            System.out.println("Error! cannot divide chocolates among the children.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        scanner.close();
    }
}