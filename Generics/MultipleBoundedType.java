interface Printable {
    void print();
}

interface Displayable {
    void display();
}

class Flight {
    private int flightNo;

    public Flight(int flightNo) {
        this.flightNo = flightNo;
    }

    public void showFlight() {
        System.out.println("Flight Number: " + flightNo);
    }
}

class AirlineFlight extends Flight implements Printable, Displayable {
    public AirlineFlight(int flightNo) {
        super(flightNo);
    }

    @Override
    public void print() {
        System.out.println("Printing Flight Ticket...");
    }

    @Override
    public void display() {
        System.out.println("Displaying Flight Details...");
    }
}

class FlightManager<T extends Flight & Printable & Displayable> {
    private T flight;

    public FlightManager(T flight) {
        this.flight = flight;
    }

    public void processFlight() {
        flight.showFlight(); 
        flight.print();   
        flight.display(); 
    }
}

public class MultipleBoundedType{
    public static void main(String[] args) {
        AirlineFlight flight = new AirlineFlight(202);
        FlightManager<AirlineFlight> manager = new FlightManager<>(flight);

        manager.processFlight();
    }
}