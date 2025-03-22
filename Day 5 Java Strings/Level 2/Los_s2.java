package level2;
import java.util.Scanner;
public class Los_s2{
    public static int findLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++ ;
            }
        }catch (IndexOutOfBoundsException e){
            return count;
        }


    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        scanner.close();


        int claclength = findLength(userInput);


        int builtin = userInput.length();


        System.out.println("Calculated length is: " + claclength);
        System.out.println("Bultin length is: " + builtin);
    }
}
