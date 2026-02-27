import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter customer id: ");
        int id = sc.nextInt();
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter mobile number: ");
        int mobNo = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accNo, mobNo, balance, name);

       
        while(true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    account.withdrawl(wit);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}