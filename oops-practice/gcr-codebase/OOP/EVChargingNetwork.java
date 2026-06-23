class ChargingStation {

    // Static variables (shared by all stations)
    static int totalStations = 0;
    static double electricityRate = 8.50; // Rate per unit

    // Instance variables
    private String stationId;
    private double unitsConsumed;

    // Constructor
    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;   // using this keyword
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate bill
    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display station details
    public void displayStationDetails() {
        System.out.println("Station ID      : " + stationId);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.println("Rate per Unit   : ₹" + electricityRate);
        System.out.println("Total Bill      : ₹" + calculateBill());
        System.out.println("-----------------------------");
    }

    // Change electricity rate for all stations
    public static void setElectricityRate(double newRate) {
        electricityRate = newRate;
    }
}

public class EVChargingNetwork {
    public static void main(String[] args) {

        // Create 5 charging stations
        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 200);
        ChargingStation s4 = new ChargingStation("CS104", 175);
        ChargingStation s5 = new ChargingStation("CS105", 90);

        System.out.println("Bills with Initial Rate (₹8.50/unit)\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        // Change electricity rate
        ChargingStation.setElectricityRate(10.00);

        System.out.println("\nAfter Rate Change to ₹10.00/unit\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}