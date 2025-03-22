import java.util.Scanner;

public class Harn3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (number > 0){
            sum += number % 10;
            number /= 10;
        }

        if(originalNumber % sum == 0){
            sum += number % 10;
            number /= 10;
        }

        if(originalNumber % sum == 0){
            System.out.println(originalNumber + "is a Harshad number.");

        }
        else{
            System.out.println(originalNumber + "is not a harshad number.");
        }
        scanner.close();
    }
}
