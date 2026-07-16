public class EmployeeBonus {

    public static double[][] generateEmployeeData(int n) {

        double[][] employees = new double[n][2];

        for (int i = 0; i < n; i++) {

            employees[i][0] = (int)(Math.random() * 90000) + 10000;

            employees[i][1] = (int)(Math.random() * 10) + 1;
        }

        return employees;
    }

    public static double[][] calculateBonus(double[][] employees) {

        double[][] result = new double[employees.length][4];

        for (int i = 0; i < employees.length; i++) {

            double oldSalary = employees[i][0];
            double years = employees[i][1];

            double bonus;

            if (years > 5)
                bonus = oldSalary * 0.05;
            else
                bonus = oldSalary * 0.02;

            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
    }

    public static void displayReport(double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-10s %-10s %-12s%n",
                "Salary", "Years", "Bonus", "New Salary");

        for (int i = 0; i < result.length; i++) {

            System.out.printf("%-10.0f %-10.0f %-10.2f %-12.2f%n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);

            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][3];
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployeeData(10);

        double[][] result = calculateBonus(employees);

        displayReport(result);
    }
}
