public class Main {
    public static void main(String[] args) {
        // declaring new bank account
        Person person = new Person("Jan", "Slaný");
        BankAccount bank = new BankAccount(1324, person);

        // all account details
        System.out.println(bank);

        // if you type correct account number, the transaction will progress
        bank.Deposit(1000000, 1324);
        System.out.println("Balance: " + bank.getAccountBalance() + "\n");

        // if type incorrect, nothing will happen
        bank.Deposit(1000000, 1224);
        System.out.println("Balance: " + bank.getAccountBalance() + "\n");

        // withdrawing money
        bank.Withdraw(500000,1324);
        System.out.println("Balance: " + bank.getAccountBalance() + "\n");

        // interest rate
        System.out.println("Interest is: " + bank.InterestRate(12000, 2, 12));

        // creating new bank account with account number 123456
        Person owner = new Person("Unknown", "User");
        BankAccount user = new BankAccount(123456, owner);

        // printing account details of account 123456
        System.out.println(user);
    }
}
