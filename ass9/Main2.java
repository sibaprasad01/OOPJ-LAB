

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }

        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

   
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("No Withdrawal");
            System.out.println("Minimum balance is 100 ");
        }

        System.out.println("Balance: " + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(500);

        a.deposit(200);
        a.withdraw(550);
        a.withdraw(50);
        a.withdraw(100);
    }
}
