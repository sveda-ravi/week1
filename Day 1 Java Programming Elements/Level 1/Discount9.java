import java.util.Scanner;
public class discount9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fee: ");
        double fee = scanner.nextDouble();
        System.out.println("Enter the discountpercent: ");
        double discountpercent = scanner.nextDouble();
        double discount = (fee * discountpercent) / 100;
        double finalamount = fee - discount;

        System.out.print("The discount amount is INR:"+discount+ "\n and final discounted fee is" +finalamount);
    }
}
