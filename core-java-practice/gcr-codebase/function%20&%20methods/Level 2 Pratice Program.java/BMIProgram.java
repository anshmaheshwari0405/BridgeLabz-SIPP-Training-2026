import java.util.*;
public class BMIProgram {

    static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightMeter = data[i][1] / 100.0;

            data[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        String[] status = getBMIStatus(persons);

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }
        sc.close();
    }
}