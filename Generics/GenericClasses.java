class Flight<T> {
    private T flightNumber;

    public Flight(T flightNumber) {
        this.flightNumber = flightNumber;
    }

    public T getFlightNumber() {
        return flightNumber;
    }
}

public class GenericClasses {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101);
        Flight<String> flight2 = new Flight<>("AA202");

        System.out.println(flight1.getFlightNumber()); 
        System.out.println(flight2.getFlightNumber()); 
    }
}