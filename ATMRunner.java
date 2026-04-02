class ATMRunner {
    public static void main(String[] args) {
        ATM atm = new ATM(123456789L, "Chaturth", 5000);

        atm.deposit(2000);
        atm.withdraw(3000);
        atm.withdraw(5000);
    }
}