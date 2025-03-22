import java.util.Scanner;

public class Fnnn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        scanner.close();
        if (num1 >= 1){
            int sum = num1 * (num1 +1) / 2;
            System.out.printf("The sum of %d natural numbers is %d%n", num1, sum);

        } else{
            System.out.printf("The number %d is not a natural number%n", num1);
        }



    }
}
