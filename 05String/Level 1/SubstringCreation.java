import java.util.Scanner;

public class SubstringCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String customSub = createSubstring(s, start, end);
        String builtInSub = s.substring(start, end);
        boolean equal = compareStrings(customSub, builtInSub);
        System.out.println("Custom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Equal: " + equal);
    }

    public static String createSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}