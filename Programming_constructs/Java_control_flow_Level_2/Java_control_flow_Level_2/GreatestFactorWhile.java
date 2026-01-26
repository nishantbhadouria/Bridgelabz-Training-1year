import java.util.*;

class GreatestFactorWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("No factors other than itself");
        } else {
            int greatestFactor = 1;          
            int counter = number - 1;       

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;                  
                }
                counter--;
            }

            System.out.println("Greatest factor (beside itself) = " + greatestFactor);
        }
    }
}
