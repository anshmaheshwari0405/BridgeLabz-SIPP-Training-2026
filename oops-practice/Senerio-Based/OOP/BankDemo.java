class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    // Static field to track total accounts
    private static int totalAccountsCreated = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccountsCreated++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed for " + holder +
                               ": Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        }
    }

    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("-----------------------------");
    }

    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount("A101", "Rahul", 10000);
        BankAccount acc2 = new BankAccount("A102", "Priya", 15000);
        BankAccount acc3 = new BankAccount("A103", "Amit", 20000);

        // 5 transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(9000);

        // 5 transactions for Account 2
        acc2.withdraw(2000);
        acc2.deposit(4000);
        acc2.withdraw(5000);
        acc2.deposit(1000);
        acc2.withdraw(15000);

        // 5 transactions for Account 3
        acc3.deposit(5000);
        acc3.withdraw(3000);
        acc3.deposit(2000);
        acc3.withdraw(10000);
        acc3.withdraw(25000); // overdraft attempt

        // Print statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccountsCreated());
    }
}