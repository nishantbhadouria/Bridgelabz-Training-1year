import java.util.*;

class Friends {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

        String yng, tall;

        
        if (a <= b && a <= c)
            yng = "Amar";
        else if (b <= c)
            yng = "Akbar";
        else
            yng = "Anthony";

        
        if (x >= y && x >= z)
            tall = "Amar";
        else if (y >= z)
            tall = "Akbar";
        else
            tall = "Anthony";

        System.out.println("Youngest: " + yng);
        System.out.println("Tallest: " + tall);
    }
}
