import java.util.Scanner;

public class PurchasePriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double quantity = sc.nextDouble();
        double unitPrice = sc.nextDouble();

        double total = quantity * unitPrice;

        System.out.printf("The total purchase price is INR %.2f if the quantity %.0f and the unit price is INR %.2f", total, quantity, unitPrice);
    }
}
