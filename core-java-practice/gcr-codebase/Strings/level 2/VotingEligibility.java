import java.util.Random;
public class VotingEligibility {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ages = new int[10];
        String[][] result = new String[10][2];
        for (int i = 0; i < 10; i++) ages[i] = rand.nextInt(90) + 10;
        for (int i = 0; i < 10; i++) {
            String canVote;
            if (ages[i] < 0) canVote = "false";
            else if (ages[i] >= 18) canVote = "true";
            else canVote = "false";
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = canVote;
        }
        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < 10; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
        
    }
}