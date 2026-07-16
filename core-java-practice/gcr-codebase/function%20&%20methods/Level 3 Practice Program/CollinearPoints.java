import java.util.*;
public class CollinearPoints {

    public static boolean isCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        return (y2 - y1) * (x3 - x2) ==
               (y3 - y2) * (x2 - x1);
    }

    public static boolean isCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * Math.abs(
                x1 * (y2 - y3)
              + x2 * (y3 - y1)
              + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear by Slope Formula");
        else
            System.out.println("Not Collinear by Slope Formula");

        if (isCollinearByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear by Area Formula");
        else
            System.out.println("Not Collinear by Area Formula");

        sc.close();
    }
}