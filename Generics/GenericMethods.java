class Utility {
    public static <T> void printDetails(T data) {
        System.out.println("Details: " + data);
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        Utility.printDetails("Flight AA202");
        Utility.printDetails(101);
        Utility.printDetails(99.5);
    }
}