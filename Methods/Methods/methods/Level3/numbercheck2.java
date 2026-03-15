public class numbercheck2 {

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for(int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for(int d : digits)
            sum += Math.pow(d,2);

        return sum;
    }

    public static boolean isHarshad(int number, int sumDigits) {
        return number % sumDigits == 0;
    }

    public static void digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        for(int i=0;i<10;i++){
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for(int d : digits)
            freq[d][1]++;

        for(int i=0;i<10;i++)
            if(freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
    }
}