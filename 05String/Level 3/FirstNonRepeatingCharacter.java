import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        char result = findFirstNonRepeating(text);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }
}