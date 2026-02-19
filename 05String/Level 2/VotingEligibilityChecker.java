import java.util.Random;

public class VotingEligibilityChecker {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 10-99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else {
                result[i][1] = ages[i] >= 18 ? "true" : "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        System.out.println("---\t--------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] eligibility = checkVotingEligibility(ages);
        displayTable(eligibility);
    }
}