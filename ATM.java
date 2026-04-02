//Create a class ATM

//Variables

//accountNumber

//customerName

//balance

//Methods

//deposit(int amount) → add money

//withdraw(int amount)

//if balance ≥ amount → withdraw

//else → print "Insufficient balance"
class ATM {
    long accountNumber;
    String customerName;
    double balance;

    ATM(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    double deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Total balance: " + balance);
        return balance;
    }

    double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }
}


	