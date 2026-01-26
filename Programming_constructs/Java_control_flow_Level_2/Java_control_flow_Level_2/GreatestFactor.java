import java.util.*;

class GreatestFactor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("No factors other than itself");
        } else {
            int greatestFactor = 1;   

            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;  
                }
            }

            System.out.println("Greatest factor = " + greatestFactor);
        }
    }
}
