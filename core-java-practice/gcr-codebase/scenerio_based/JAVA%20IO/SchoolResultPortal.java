import java.io.*;
import java.util.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {
            Scanner sc = new Scanner(new File(inputFile));

            
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(outputFile, true));

            writer.write("\n===== NEW REPORT =====\n");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (line.trim().isEmpty())
                    continue;

                String[] data = line.split("\\s+");

                String name = data[0];
                int total = 0;
                int subjects = data.length - 1;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / subjects;

                writer.write("Student Name : " + name + "\n");
                writer.write("Average Marks: "
                        + String.format("%.2f", average) + "\n");

                if (average >= 90)
                    writer.write("Grade        : A+\n");
                else if (average >= 75)
                    writer.write("Grade        : A\n");
                else if (average >= 60)
                    writer.write("Grade        : B\n");
                else
                    writer.write("Grade        : C\n");

                writer.write("----------------------------\n");
            }

            sc.close();
            writer.close();

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format in input file.");
        }
    }
}