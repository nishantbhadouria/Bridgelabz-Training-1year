import java.util.Scanner;

public class smallest {

    public static void findSmallestAndLargest(int a, int b, int c) {

        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findSmallestAndLargest(a, b, c);
    }
}