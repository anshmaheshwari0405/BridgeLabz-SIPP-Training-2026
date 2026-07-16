public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radius = 6387.0;
        double radiusMiles =  6387 * 1.6;
        double pi = 3.14;

        double volume = (4.0/3.0) * pi * Math.pow(radius, 3.0);
        double cubicMiles = (4.0/3.0) * pi * Math.pow(radiusMiles, 3.0);

        System.out.println("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + cubicMiles);
    }
}