class BankAccount {
    String name;
    double accountNumber;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.name = " Venkata charishma";
        account.accountNumber = 123456789;
        account.balance = 0;

        account.deposit(5000);
        account.withdraw(3000);
        account.checkBalance();
        account.displayDetails();
    }
}
