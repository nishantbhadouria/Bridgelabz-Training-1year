import java.util.*;

class PowerOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number and power:");
        int number = sc.nextInt();
        int power = sc.nextInt();

        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers");
        } else {
            int result = 1;   // initial value

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println("Result = " + result);
        }
    }
}
