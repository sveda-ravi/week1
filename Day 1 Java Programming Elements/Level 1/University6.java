public class University6 {
    public static void main(String[] args) {
        double fee = 125000;
        double discountpercent = 10;

        double discount = (fee * discountpercent) / 100;

        double finalamount = fee - discount;

        System.out.print("The discount amount is INR:"+discount+ "\n and final discounted fee is" +finalamount);
    }

}
