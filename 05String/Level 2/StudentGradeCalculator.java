import java.util.Random;
import java.util.Scanner;


public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Phy\tChem\tMath\tTotal\tPer\tGrade");

        for (int i = 0; i < n; i++) {

            int p = 10 + (int)(Math.random() * 90);
            int c = 10 + (int)(Math.random() * 90);
            int m = 10 + (int)(Math.random() * 90);

            int total = p + c + m;
            double per = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            String grade;
            if (per >= 90) grade = "A+";
            else if (per >= 80) grade = "A";
            else if (per >= 70) grade = "B";
            else if (per >= 60) grade = "C";
            else if (per >= 50) grade = "D";
            else grade = "F";

            System.out.println(p + "\t" + c + "\t" + m + "\t" +
                               total + "\t" + per + "\t" + grade);
        }

        sc.close();
    }
}
