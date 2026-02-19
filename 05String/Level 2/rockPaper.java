import java.util.Scanner;

public class rockPaper {

    public static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "Rock";
        if (n == 1) return "Paper";
        return "Scissors";
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return "User";
        else
            return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        int userWins = 0, compWins = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= games; i++) {

            String user = sc.nextLine();
            user = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();

            String comp = computerChoice();
            String result = winner(user, comp);

            if (result.equals("User")) userWins++;
            if (result.equals("Computer")) compWins++;

            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + result);
        }

        double userPer = (userWins * 100.0) / games;
        double compPer = (compWins * 100.0) / games;

        System.out.println("\nPlayer\tWins\tPercentage");
        System.out.println("User\t" + userWins + "\t" + String.format("%.2f", userPer) + "%");
        System.out.println("Computer\t" + compWins + "\t" + String.format("%.2f", compPer) + "%");

        sc.close();
    }
}
