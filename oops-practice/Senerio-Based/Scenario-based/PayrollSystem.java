// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String employeeName;

    // Constructor
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayEmployeeInfo() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String employeeName,
                            int hoursWorked, double hourlyRate) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class PayrollSystem {
    public static void main(String[] args) {

        // Full-time employee
        FullTimeEmployee fullTimeEmp =
                new FullTimeEmployee(101, "Rahul Sharma", 50000);

        // Part-time employee
        PartTimeEmployee partTimeEmp =
                new PartTimeEmployee(102, "Priya Singh", 80, 500);

        System.out.println("===== Full-Time Employee =====");
        fullTimeEmp.displayEmployeeInfo();
        System.out.println("Salary : ₹" + fullTimeEmp.calculateSalary());

        System.out.println("\n===== Part-Time Employee =====");
        partTimeEmp.displayEmployeeInfo();
        System.out.println("Salary : ₹" + partTimeEmp.calculateSalary());
    }
}