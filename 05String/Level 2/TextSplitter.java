import java.util.Scanner;
import java.util.Arrays;

public class TextSplitter {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 0;
        int[] spaceIndexes = new int[len];
        int spaceIndex = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
                wordCount++;
            }
        }
        wordCount++;
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < spaceIndex; i++) {
            int end = spaceIndexes[i];
            words[wordIndex++] = text.substring(start, end);
            start = end + 1;
        }
        words[wordIndex] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] customSplit = splitWords(input);
        String[] builtInSplit = input.split("\\s+");
        boolean equal = compareArrays(customSplit, builtInSplit);
        System.out.println("Custom split: " + Arrays.toString(customSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Arrays equal: " + equal);
    }
}