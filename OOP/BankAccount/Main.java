public class Main {
    public static void main(String[] args) {
        // declaring new bank account
        BankAccount bank = new BankAccount(1324, "slanja", 156824);

        // all account details
        System.out.println(
                "Account number: " + bank.getAccountNumber() +
                "\nOwner: " + bank.getAccountOwner() +
                "\nBalance: " + bank.getAccountBalance() + "\n"
        );

        // if you type correct account number, the transaction will progress
        bank.Deposit(1000000, 1324);
        System.out.println("Balance: " + bank.getAccountBalance() + "\n");

        // if type incorrect, nothing will happen
        bank.Deposit(1000000, 1224);
        System.out.println("Balance: " + bank.getAccountBalance() + "\n");

        // withdrawing money
        bank.Withdraw(500000,1324);
        System.out.println("Balance: " + bank.getAccountBalance() + "\n");
    }
}
