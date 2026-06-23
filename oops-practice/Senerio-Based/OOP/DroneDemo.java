class Drone {
    // Instance variables
    private String droneId;
    private int batteryPercentage;

    // Static variable shared by all drones
    static String companyName = "SkyLogistics";

    // Constructor using 'this' keyword
    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    public void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println("Drone " + droneId + " has started delivery.");
            batteryPercentage -= 10; // simulate battery usage
        } else {
            System.out.println("Drone " + droneId +
                               " cannot start delivery. Low battery!");
        }
    }

    // Method to display drone status
    public void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
        System.out.println();
    }
}

public class DroneDemo {
    public static void main(String[] args) {

        // Create multiple drones
        Drone d1 = new Drone("DR101", 85);
        Drone d2 = new Drone("DR102", 60);
        Drone d3 = new Drone("DR103", 15);

        // Start deliveries
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println();

        // Display status of all drones
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Verify shared company name
        System.out.println("Company Name from d1: " + Drone.companyName);
        System.out.println("Company Name from d2: " + Drone.companyName);
        System.out.println("Company Name from d3: " + Drone.companyName);
    }
}