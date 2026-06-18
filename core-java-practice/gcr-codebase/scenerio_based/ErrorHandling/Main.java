class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available: ₹" + balance +
                ", Requested: ₹" + amount
            );
        }

        balance -= amount;
        System.out.println("Withdrawal Successful.");
    }
}

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        try {
            atm.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}