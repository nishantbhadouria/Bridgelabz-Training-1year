import java.util.Scanner;

public class StringTrimmer {

    static String myTrim(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') i++;
        while (j >= i && s.charAt(j) == ' ') j--;
        String r = "";
        for (int k = i; k <= j; k++) r += s.charAt(k);
        return r;
    }

    static boolean equal(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String t1 = myTrim(s);
        String t2 = s.trim();

        System.out.println("Custom: " + t1);
        System.out.println("Built-in: " + t2);
        System.out.println("Equal: " + equal(t1, t2));

        sc.close();
    }
}
