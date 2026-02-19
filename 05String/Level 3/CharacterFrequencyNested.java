import java.util.Scanner;

public class CharacterFrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        String[] freq = findFrequency(text);
        System.out.println("Character frequencies:");
        for (String pair : freq) {
            System.out.println(pair);
        }
        sc.close();
    }

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[j] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        String[] result = new String[chars.length];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[count++] = chars[i] + ": " + freq[i];
            }
        }
        String[] trimmed = new String[count];
        System.arraycopy(result, 0, trimmed, 0, count);
        return trimmed;
    }
}