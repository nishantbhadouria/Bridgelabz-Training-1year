import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // 0: weight in kg, 1: height in cm
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight for person " + (i + 1) + " in kg:");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height for person " + (i + 1) + " in cm:");
            data[i][1] = sc.nextDouble();
        }
        String[][] results = computeAll(data);
        display(results);
        sc.close();
    }

    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.format("%.2f", heightCm), String.format("%.2f", weight), String.format("%.2f", bmi), status};
    }

    public static String[][] computeAll(double[][] data) {
        String[][] results = new String[10][4];
        for (int i = 0; i < 10; i++) {
            results[i] = computeBMI(data[i][0], data[i][1]);
        }
        return results;
    }

    public static void display(String[][] results) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }
}