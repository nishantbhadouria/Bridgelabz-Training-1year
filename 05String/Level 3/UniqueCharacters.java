import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        System.out.println("Unique characters:");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int getLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end
        }
        return len;
    }

    public static char[] findUnique(String text) {
        int len = getLength(text);
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
}