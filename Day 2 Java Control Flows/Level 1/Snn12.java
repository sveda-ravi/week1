import java.util.Scanner;

public class Snn12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        scanner.close();

        if(n < 1) {
            System.out.println("The number " + n+ "is not a natural number");
            return;
        }

        int sumfor = n * (n+1)/2 ;

        int suml = 0;
        int i = 0;
        while(i<=n){
            suml += i;
            i++;
        }
        System.out.println("sum using formula: " + sumfor);
        System.out.println("sum using while loop: " + suml);
        System.out.println("Are these both results equal? " + (sumfor == suml));

    }
}
