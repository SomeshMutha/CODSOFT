import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        this.userAccount = account;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= userAccount.getBalance()) {
            userAccount.withdraw(amount);
            System.out.println("Withdraw Successful. Your account balance is " + userAccount.getBalance());
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            userAccount.deposit(amount);
            System.out.println("Deposit Successful. Your account balance is " + userAccount.getBalance());
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void checkBalance() {
        System.out.println("Your account balance is " + userAccount.getBalance());
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);

        while (true) {
            System.out.println("Please Choose Service:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the Amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.println("Enter the Amount to deposit:");
                    int depositAmount = sc.nextInt();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
