package level3;
import java.util.*;
public class Bmic_s3 {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];


        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;


            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;


            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal weight";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";


            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }


        return result;
    }
    public static void displayBMIResult(String[][] result) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");


        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t\t" + result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" + result[i][3]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] inputData = new double[10][2];


        System.out.println("Enter weight (kg) and height (cm) of 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            inputData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            inputData[i][1] = sc.nextDouble();
        }


        String[][] result = calculateBMI(inputData);
        displayBMIResult(result);
    }
}
