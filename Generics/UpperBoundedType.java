class FlightSchedule<T extends Number> {
    private T flightCode;

    public FlightSchedule(T flightCode) {
        this.flightCode = flightCode;
    }

    public T getFlightCode() {
        return flightCode;
    }
}

public class UpperBoundedType {
    public static void main(String[] args) {
        FlightSchedule<Integer> flight1 = new FlightSchedule<>(202); 
        FlightSchedule<Double> flight2 = new FlightSchedule<>(202.5);
    }
}