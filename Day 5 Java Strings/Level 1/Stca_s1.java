package level1;
import java.util.Scanner;

public class Stca_s1 {
    public static char[] customtoCharArray(String str){
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.next();
        scan.close();

        char[] customArray =  customtoCharArray(str);
        char[] builtInArray = str.toCharArray();

        System.out.println("Both methods give the same result: " + compareArrays(customArray, builtInArray));
    }

}
