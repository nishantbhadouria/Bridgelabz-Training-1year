import java.util.Scanner;

public class chocolate {

    public static void distributeChocolates(int chocolates, int children) {

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Chocolates each child gets: " + eachChild);
        System.out.println("Remaining chocolates: " + remaining);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        distributeChocolates(chocolates, children);
    }
}