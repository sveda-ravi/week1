package level1;
import java.util.Scanner;

public class Sc_s1 {
    public static boolean compareString(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        for (int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the first string: ");
        String str1 = scan.next();

        System.out.print("enter the second string: ");
        String str2 = scan.next();

        scan.close();

        boolean result = compareString(str1, str2);

        boolean equalsResult = str1.equals(str2);

        System.out.println("Comparision using charAt(): " + result);
        System.out.println("Comparision using equals(): " + equalsResult);
        System.out.println("Both results match: " + (result == equalsResult));
    }
}
