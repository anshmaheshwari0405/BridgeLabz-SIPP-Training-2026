class Flight<T> {
    private T flightNumber;
    private String departure;
    private String destination;

    public Flight(T flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    public T getFlightNumber() {
        return flightNumber;
    }

    public void displayFlightInfo() {
        System.out.println("Flight: " + flightNumber + " | From: " + departure + " | To: " + destination);
    }
}

class Booking<T> {
    private T bookingId;
    private Flight<?> flight;
    private String passengerName;

    public Booking(T bookingId, Flight<?> flight, String passengerName) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        flight.displayFlightInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "Delhi", "Mumbai");
        Flight<String> flight2 = new Flight<>("AI202", "New York", "London");

        Booking<Integer> booking1 = new Booking<>(5001, flight1, "Harsh Sharma");
        Booking<String> booking2 = new Booking<>("BK1002", flight2, "Kush Gupta");

        System.out.println("----- Flight Details -----");
        flight1.displayFlightInfo();
        flight2.displayFlightInfo();

        System.out.println("\nFlight 1 Number: " + flight1.getFlightNumber());
        System.out.println("Flight 2 Number: " + flight2.getFlightNumber());

        System.out.println("\n----- Booking Details -----");
        booking1.displayBookingInfo();

        System.out.println();

        booking2.displayBookingInfo();
    }
}