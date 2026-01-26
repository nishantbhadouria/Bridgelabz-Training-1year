import java.util.Scanner;

class SumNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter a number:");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int i = 1;
            int sumLoop = 0;

            while (i <= n) {
                sumLoop = sumLoop + i;
                i++;
            }

            
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sumLoop);
            System.out.println("Sum using formula   = " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are NOT equal.");
            }
        }
    }
}
