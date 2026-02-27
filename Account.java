class Account{
    int accountNo;
    int mobNo;
    double balance;
    String customerName;

    Account(int accountNo, int mobNo, double balance, String customerName) {
        this.accountNo = accountNo;
        this.mobNo = mobNo;
        this.balance = balance;
        this.customerName = customerName;

      
        if(accountNo < 10) {
            System.out.println("Invalid account number:");
        } else {
            System.out.println("Valid account number:");
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Amount remained: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdrawl(double amount) {
        if(amount > 0) {
            balance = balance - amount;
            System.out.println("Amount remained: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }
}

	
	
			
	