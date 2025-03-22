package level1;
import java.util.Scanner;

public class Siobe_s1 {
    public static void generateException(String str){

        System.out.println("Character at index" + str.length() +":" + str.charAt(str.length()));

    }

    public static void handleException(String str){
        try{
            System.out.println("Character at index " + str.length()+ ":" + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Caught StringIndexOutOfBoundsException! Invalid index accessed");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scan.nextLine();
        scan.close();


        handleException(userInput);
    }
}
