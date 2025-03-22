public class Profit {
    public static void main(String[] args) {

        int cp = 129;
        int sp = 191;

        int profit = sp - cp;
        double profitPercentage = ((double) profit / cp) * 100;

        System.out.println("The cost price in INR " + cp + "and the selling price is INR " +sp + "\n and The profit is " + profit + " and the profit percentage is " + profitPercentage + "%");
    }
}
