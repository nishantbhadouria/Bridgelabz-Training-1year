import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        generateException(s);
        handleException(s);
    }

    public static void generateException(String s) {
        Integer.parseInt(s); // If not number
    }

    public static void handleException(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}