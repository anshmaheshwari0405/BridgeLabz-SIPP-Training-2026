import java.util.*;
public class StudentScoreCard {

    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {

            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = total / 3.0;

            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static char getGrade(double percentage) {

        if (percentage >= 80)
            return 'A';
        else if (percentage >= 70)
            return 'B';
        else if (percentage >= 60)
            return 'C';
        else if (percentage >= 50)
            return 'D';
        else if (percentage >= 40)
            return 'E';
        else
            return 'R';
    }

    public static void displayScoreCard(
            int[][] scores,
            double[][] result) {

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    getGrade(result[i][2])
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        double[][] result = calculateResults(scores);

        displayScoreCard(scores, result);

        sc.close();
    }
}