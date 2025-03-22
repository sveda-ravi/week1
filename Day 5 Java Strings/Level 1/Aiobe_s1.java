package level1;
import java.util.Scanner;

public class Aiobe_s1{
    public static void generateException(String[] names){
        System.out.println("Accessing invalid index: "+ names[10]);
    }

    public static void handleException(String[] names){
        try{
            System.out.println("Accessing invalid index: " + names[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bound");
        }
        catch(RuntimeException e){
            System.out.println("Caught a general RuntimeException!");

        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] names = {"Alice", "Bob", "John", "Charlie", "David", "Emma"};

        System.out.println("Enter an index to access (0-4): ");
        int index = scan.nextInt();

        scan.close();

        try{
            System.out.println("Name at index " + index + ":" + names[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of boounds! please enter a valid index");
        }
    }
}
