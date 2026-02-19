import java.util.Scanner;

public class WordsWithLengths {
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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        System.out.println("Word\t\tLength");
        System.out.println("----\t\t------");
        for (String[] row : wordsWithLengths) {
            System.out.printf("%-10s\t%d\n", row[0], Integer.parseInt(row[1]));
        }
    }
}