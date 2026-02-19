import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        System.out.println("Logic 1 (Iterative): " + isPalindrome1(text));
        System.out.println("Logic 2 (Recursive): " + isPalindrome2(text));
        System.out.println("Logic 3 (Array): " + isPalindrome3(text));
        sc.close();
    }

    // Logic 1: Iterative
    public static boolean isPalindrome1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive
    public static boolean isPalindrome2(String text) {
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using arrays
    public static boolean isPalindrome3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    private static char[] reverseString(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(text.length() - 1 - i);
        }
        return arr;
    }
}