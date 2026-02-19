import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        generateException(s);
        handleException(s);
    }

    public static void generateException(String s) {
        s.substring(5, 2); // start > end
    }

    public static void handleException(String s) {
        try {
            s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}