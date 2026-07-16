// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    // Constructor
    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}

// Car subclass
class Car extends Vehicle {
    private double dailyRate;

    public Car(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Car");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Bike subclass
class Bike extends Vehicle {
    private double dailyRate;

    public Bike(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Bike");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public Truck(String vehicleNumber, double dailyRate, double loadingCharge) {
        super(vehicleNumber, "Truck");
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        int rentalDays = 5;

        Car car = new Car("DL01AB1234", 2000);
        Bike bike = new Bike("DL02CD5678", 500);
        Truck truck = new Truck("DL03EF9012", 3500, 1500);

        System.out.println("===== Car Details =====");
        car.displayVehicleInfo();
        System.out.println("Rental Cost for " + rentalDays +
                           " days: ₹" + car.calculateRentalCost(rentalDays));

        System.out.println("\n===== Bike Details =====");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost for " + rentalDays +
                           " days: ₹" + bike.calculateRentalCost(rentalDays));

        System.out.println("\n===== Truck Details =====");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost for " + rentalDays +
                           " days: ₹" + truck.calculateRentalCost(rentalDays));
    }
}