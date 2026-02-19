import java.util.Scanner;

public class CharacterFrequencyUnique {
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

    public static char[] findUnique(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount++] = c;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = findUnique(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = "" + unique[i];
            result[i][1] = "" + freq[unique[i]];
        }
        return result;
    }
}