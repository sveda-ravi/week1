package level1;
public class Npd_s1 {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException! String is null.");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
