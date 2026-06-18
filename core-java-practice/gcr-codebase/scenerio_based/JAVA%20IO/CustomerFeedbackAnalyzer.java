import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int goodCount = 0;

        try {
            System.out.println("Enter 5 feedback messages:");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Feedback " + i + ": ");
                String feedback = br.readLine();

                // Case-insensitive check for the word "good"
                if (feedback.toLowerCase().contains("good")) {
                    goodCount++;
                }
            }

            System.out.println("\nNumber of feedback messages containing 'good': "
                    + goodCount);

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}