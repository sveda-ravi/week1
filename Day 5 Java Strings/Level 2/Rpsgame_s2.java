package level2;
import java.util.Scanner;
public class Rpsgame_s2 {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return choice == 0 ? "rock" : choice == 1 ? "paper" : "scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";
        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(computerWins);
        stats[0][2] = (userWins * 100 / totalGames) + "%";
        stats[1][2] = (computerWins * 100 / totalGames) + "%";
        return stats;
    }
    public static void displayGameResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWinning %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();


        String[][] gameResults = new String[n][3];
        int userWins = 0, computerWins = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);


            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;


            gameResults[i][0] = user;
            gameResults[i][1] = computer;
            gameResults[i][2] = winner;
        }


        String[][] stats = calculateStats(userWins, computerWins, n);
        displayGameResults(gameResults, stats);
    }
}
