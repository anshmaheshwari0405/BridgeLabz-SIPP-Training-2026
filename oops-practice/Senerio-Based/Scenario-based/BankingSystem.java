// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }

    // Abstract method
    public abstract double calculateInterest();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;

    public CurrentAccount(String accountNumber, String holderName,
                          double balance, double monthlyBonusRate) {
        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {

        // Savings Account
        SavingsAccount savings =
                new SavingsAccount("SA101", "Rahul Sharma", 50000, 5);

        savings.deposit(10000);
        savings.withdraw(5000);

        System.out.println("\n===== Savings Account =====");
        savings.displayAccountDetails();
        System.out.println("Interest : ₹" + savings.calculateInterest());

        // Current Account
        CurrentAccount current =
                new CurrentAccount("CA201", "Priya Singh", 80000, 2);

        current.deposit(20000);
        current.withdraw(10000);

        System.out.println("\n===== Current Account =====");
        current.displayAccountDetails();
        System.out.println("Interest : ₹" + current.calculateInterest());
    }
}