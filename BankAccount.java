
import java.util.ArrayList;

public class BankAccount {

    private double balance;
    private ArrayList<String> transactions;

    // Constructor
    public BankAccount() {
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactions.add("Deposited: $" + amount);
            System.out.println("Deposit successful!");
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            transactions.add("Withdrew: $" + amount);
            System.out.println("Withdrawal successful!");
        }
        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else {
            System.out.println("Insufficient funds.");
        }
    }

    // View account balance
    public void viewBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    // View transaction history
    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions have been made.");
        }
        else {
            System.out.println("\nTransaction History:");

            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(transactions.get(i));
            }
        }
    }
}

