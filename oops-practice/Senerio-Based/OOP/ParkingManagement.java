class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using this keyword
    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name    : " + ownerName);
        System.out.println("Vehicle Type  : " + vehicleType);
        System.out.println("---------------------------");
    }

    public String getVehicleType() {
        return vehicleType;
    }
}

public class ParkingManagement {

    // Display all cars
    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("\n===== CARS =====");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    // Display all bikes
    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n===== BIKES =====");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        // Array of 10 vehicles
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP81AB1010", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP81CD2020", "Priya", "Bike");
        vehicles[2] = new Vehicle("UP81EF3030", "Amit", "Car");
        vehicles[3] = new Vehicle("UP81GH4040", "Neha", "Bike");
        vehicles[4] = new Vehicle("UP81IJ5050", "Rohan", "Car");
        vehicles[5] = new Vehicle("UP81KL6060", "Anjali", "Bike");
        vehicles[6] = new Vehicle("UP81MN7070", "Vikas", "Car");
        vehicles[7] = new Vehicle("UP81OP8080", "Pooja", "Bike");
        vehicles[8] = new Vehicle("UP81QR9090", "Karan", "Car");
        vehicles[9] = new Vehicle("UP81ST1111", "Sneha", "Bike");

        // Display vehicles based on type
        displayCars(vehicles);
        displayBikes(vehicles);
    }
}