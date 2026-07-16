import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feet = sc.nextDouble();
        double yard = feet/3.0;
        double mile = yard/1760.0;

        System.out.printf("Distance in feet is %.2f while in yard is %.2f and miles is %.2f", feet, yard, mile);
    }
}
