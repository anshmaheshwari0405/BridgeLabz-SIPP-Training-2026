
class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {

    static void processPayment(double billAmount, double amountPaid)
            throws InsufficientFundsException {

        if (amountPaid < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds."
            );
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        int[] patientIds = {101, 102, 103};

        try {

            int totalBill = 5000;
            int items = 0;
            int costPerItem = totalBill / items;

            System.out.println(costPerItem);

        } catch (ArithmeticException e) {
            System.out.println("Billing Error: Number of items cannot be zero.");
        }

        try {

            System.out.println(patientIds[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient Error: Invalid patient index.");
        }

        try {

            String input = "ABC";
            int amount = Integer.parseInt(input);

            System.out.println(amount);

        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter a valid numeric value.");
        }

        try {

            processPayment(5000, 3000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("System continues running safely.");
    }
}
