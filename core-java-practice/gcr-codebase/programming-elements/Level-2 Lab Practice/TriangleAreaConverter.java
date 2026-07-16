import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        double areaInches = 0.5 * (base/2.54) * (height/2.54);

        System.out.printf("The Area of the triangle in sq cm is %.2f and in inch is %.2f",area ,areaInches);
    }
}
