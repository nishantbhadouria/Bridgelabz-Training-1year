public class numbercheck3 {

    public static boolean isPalindrome(int number) {

        int original = number;
        int reversed = 0;

        while(number > 0){
            reversed = reversed*10 + number%10;
            number /= 10;
        }

        return original == reversed;
    }

    public static boolean isDuck(int number) {

        number /= 10;

        while(number > 0){
            if(number % 10 == 0)
                return true;

            number /= 10;
        }

        return false;
    }
}