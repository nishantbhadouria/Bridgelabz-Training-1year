import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        String[][] freq = findFrequency(text);
        System.out.println("Character frequencies:");
        for (String[] pair : freq) {
            System.out.println(pair[0] + ": " + pair[1]);
        }
        sc.close();
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }
        String[][] result = new String[256][2];
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[count][0] = "" + (char) i;
                result[count][1] = "" + freq[i];
                count++;
            }
        }
        String[][] trimmed = new String[count][2];
        System.arraycopy(result, 0, trimmed, 0, count);
        return trimmed;
    }
}