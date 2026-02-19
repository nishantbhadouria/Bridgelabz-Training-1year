import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        generateException(s);
        handleException(s);
    }

    public static void generateException(String s) {
        s.charAt(s.length()); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleException(String s) {
        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}