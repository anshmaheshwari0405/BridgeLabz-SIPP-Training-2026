import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Open file in append mode
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("expenses.txt", true));

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            // Write expense to file
            writer.write(category + " - " + amount);
            writer.newLine();

            writer.close();

            System.out.println("Expense saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        sc.close();
    }
}