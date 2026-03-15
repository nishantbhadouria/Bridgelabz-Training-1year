import java.util.Scanner;

public class quoandrem {

    public static void findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        findRemainderAndQuotient(number, divisor);
    }
}