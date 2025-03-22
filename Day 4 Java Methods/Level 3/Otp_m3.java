package level3;
import java.util.HashSet;
import java.util.Random;

public class Otp_m3 {
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }
    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();

        for (int otp : otpArray) {
            uniqueOTPs.add(otp);
        }

        return uniqueOTPs.size() == otpArray.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        boolean isUnique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (isUnique ? "Yes" : "No"));
    }
}
