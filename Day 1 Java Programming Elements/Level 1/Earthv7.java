public class Earthv7 {
    public static void main(String[] args){
        double radiuskm = 6378;
        double pi = Math.PI;

        double volumekm3 = (4 / 3) * pi * Math.pow(radiuskm, 3);

        double conversionfactor = Math.pow(0.621371, 3);
        double volumemiles = volumekm3 * conversionfactor;

        System.out.println("Volume of Earth in cubic kilometers is :" +volumekm3+ "and cubic miles is : " +volumemiles);

    }
}
