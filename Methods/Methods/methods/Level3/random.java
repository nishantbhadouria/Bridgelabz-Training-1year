
import java.util.Random;

public class random {

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static void main(String[] args) {

        Random r = new Random();
        int[] heights = new int[11];

        for(int i = 0; i < heights.length; i++)
            heights[i] = r.nextInt(101) + 150; // 150–250

        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean height: " + mean(heights));
    }
}