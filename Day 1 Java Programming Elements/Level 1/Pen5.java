public class Pen5{
    public static void main(String[] args){
        int totalpens = 14;
        int students = 3;

        int pensperstu = totalpens / students;

        int remainingpens = totalpens % students;

        System.out.println("Each student gets " + pensperstu + "pens.");
        System.out.println("Remaining pens that cannot be distributed: " + remainingpens);

    }
}

