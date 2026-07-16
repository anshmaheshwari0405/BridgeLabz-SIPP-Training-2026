import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock","paper","scissors"};
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int playerWins = 0, compWins = 0, draws = 0;
        String[][] results = new String[games][3];
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String player = sc.next().toLowerCase();
            String comp = choices[(int)(Math.random() * 3)];
            String winner;
            if (player.equals(comp)) {
                winner = "Draw"; draws++;
            } else if ((player.equals("rock") && comp.equals("scissors")) ||
                       (player.equals("scissors") && comp.equals("paper")) ||
                       (player.equals("paper") && comp.equals("rock"))) {
                winner = "Player"; playerWins++;
            } else {
                winner = "Computer"; compWins++;
            }
            results[i][0] = player;
            results[i][1] = comp;
            results[i][2] = winner;
        }
        System.out.println("Game\tPlayer\tComputer\tWinner");
        for (int i = 0; i < games; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        double playerPct = (playerWins * 100.0) / games;
        double compPct = (compWins * 100.0) / games;
        System.out.println("\nPlayer Wins: " + playerWins + " (" + playerPct + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPct + "%)");
        System.out.println("Draws: " + draws);
        sc.close();
    }
}