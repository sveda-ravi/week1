import java.util.Scanner;

public class Dby5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean isD = (num % 5 ==0);

        System.out.printf("Is the number %d divisible by 5? %b%n", num, isD);

    }
}
