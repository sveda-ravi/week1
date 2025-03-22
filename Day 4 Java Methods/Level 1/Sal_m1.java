package level1;
import java.util.Scanner;

public class Sal_m1{
    public static int[] findSmallestAndLargest(int num1, int num2, int num3){
        int smallest = Math.min(num1, Math.min(num2, num3));
        int Largest = Math.max(num1, Math.max(num2, num3));
        return new int[] {smallest, Largest};
    }
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = Scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = Scanner.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = Scanner.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        Scanner.close();

    }
}
