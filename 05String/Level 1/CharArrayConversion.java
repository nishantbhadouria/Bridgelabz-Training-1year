import java.util.Scanner;

public class CharArrayConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        char[] customArr = toCharArrayCustom(s);
        char[] builtInArr = s.toCharArray();
        boolean equal = compareArrays(customArr, builtInArr);
        System.out.println("Custom array: " + new String(customArr));
        System.out.println("Built-in array: " + new String(builtInArr));
        System.out.println("Equal: " + equal);
    }

    public static char[] toCharArrayCustom(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }
}