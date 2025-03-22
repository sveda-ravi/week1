import java.util.Scanner;
public class conersion8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        int km = scanner.nextInt();
        double mil = km * 1.6;
        System.out.println("The total miles is " +mil+ "for the given km: "+km);

    }
}
