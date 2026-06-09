import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double heightcm = sc.nextDouble();
        
        double heightInch = heightcm/2.54;

        double heightFeet = heightInch/12;

        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f",heightcm, heightFeet, heightInch);

    }
}