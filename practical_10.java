class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder,
                long accountNumber, double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    long getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

   void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class practical_10 {
    public static void main(String[] args) {

        BankAccount account =
            new BankAccount("Aman", 123456789, 5000);

        account.display();

        System.out.println("\nTransactions:");

        account.deposit(2000);
        account.deposit(-500);

        account.withdraw(1000);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("\nFinal Balance: " +
                           account.getBalance());
    }
}
