import java.util.Scanner;
class Account
{
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int accNo, String type, double bal) {
        customerName = name;
        accountNumber = accNo;
        accountType = type;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount Deposited. Updated Balance = " + balance);
    }

    void displayBalance() {
        System.out.println("Current Balance = " + balance);
    }
}
class Sav_acct extends Account {

    Sav_acct(String name, int accNo, double bal) {
        super(name, accNo, "Savings", bal);
    }
    void computeInterest(double rate, int time) {
        double interest = balance * Math.pow((1 + rate / 100.0), time) - balance;
        balance += interest;
        System.out.println("Interest added. Updated Balance = " + balance);
    }
    void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amt;
            System.out.println("Withdrawal successful. Updated Balance = " + balance);
        }
    }
}
class Cur_acct extends Account {
    final double MIN_BAL = 1000;
    final double SERVICE_CHARGE = 200;

    Cur_acct(String name, int accNo, double bal) {
        super(name, accNo, "Current", bal);
    }

    void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amt;
        System.out.println("Withdrawal successful.");
        if (balance < MIN_BAL) {
            balance -= SERVICE_CHARGE;
            System.out.println("Below minimum balance! Service charge imposed.");
        }

        System.out.println("Updated Balance = " + balance);
    }
}
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        System.out.println("Select Account Type: 1. Savings 2. Current");
        int choice = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        if (choice == 1) {
            Sav_acct sa = new Sav_acct(name, accNo, bal);

            sa.displayBalance();
            sa.deposit(5000);
            sa.computeInterest(5, 2);
            sa.withdraw(2000);
            sa.displayBalance();

        } else if (choice == 2) {
            Cur_acct ca = new Cur_acct(name, accNo, bal);

            ca.displayBalance();
            ca.deposit(3000);
            ca.withdraw(500);
            ca.withdraw(2000);  
            ca.displayBalance();
        } else {
            System.out.println("Invalid Account Type!");
        }

        sc.close();
    }
}