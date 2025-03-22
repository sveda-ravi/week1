import java.util.Scanner;

public class Ve5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age >= 18){

            System.out.printf("The person's age is %d and is eligible to vote%n", age);

        } else{
            System.out.printf("The person;s age is %d and cannot vote%n", age);
        }



    }
}
