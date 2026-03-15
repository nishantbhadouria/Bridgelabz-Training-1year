import java.util.*;

public class numbercheck1
 {

    public static int countDigits(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int digits = countDigits(n);
        int[] arr = new int[digits];

        for(int i = digits-1; i >=0; i--){
            arr[i] = n % 10;
            n /= 10;
        }

        return arr;
    }

    public static boolean isDuck(int[] arr) {
        for(int i = 1; i < arr.length; i++)
            if(arr[i] == 0) return true;

        return false;
    }

    public static boolean isArmstrong(int[] arr) {
        int power = arr.length;
        int sum = 0;

        for(int d : arr)
            sum += Math.pow(d, power);

        int number = 0;
        for(int d : arr)
            number = number*10 + d;

        return sum == number;
    }

    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > first){
                second = first;
                first = x;
            }
            else if(x > second && x != first){
                second = x;
            }
        }
        return second;
    }

    public static int secondSmallest(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int x : arr){
            if(x < first){
                second = first;
                first = x;
            }
            else if(x < second && x != first){
                second = x;
            }
        }
        return second;
    }
}