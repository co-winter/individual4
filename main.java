
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== BANK ACCOUNT SIMULATOR =====");
            System.out.println("1. View account balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View transaction history");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            if (choice == 1) {
                account.viewBalance();
            }
            else if (choice == 2) {
                System.out.print("Enter deposit amount: $");
                double amount = input.nextDouble();
                account.deposit(amount);
            }
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: $");
                double amount = input.nextDouble();
                account.withdraw(amount);
            }
            else if (choice == 4) {
                account.viewTransactions();
            }
            else if (choice == 5) {
                System.out.println("Thank you for using the Bank Account Simulator!");
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        input.close();
    }
}
