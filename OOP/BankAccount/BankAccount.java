public class Main {
    public static void main(String[] args) {
        // declaring new bank account
        Person person = new Person("Jan", "Slaný");
        BankAccount myAccount = new BankAccount(1324, person);

        // all account details
        System.out.println(myAccount);

        // if you type correct account number, the transaction will progress
        myAccount.Deposit(1000000, 1324);
        System.out.println("Balance: " + myAccount.getAccountBalance() + "\n");

        // if type incorrect, nothing will happen
        myAccount.Deposit(1000000, 1224);
        System.out.println("Balance: " + myAccount.getAccountBalance() + "\n");

        // withdrawing money
        myAccount.Withdraw(500000,1324);
        System.out.println("Balance: " + myAccount.getAccountBalance() + "\n");

        // interest rate
        System.out.println("Interest is: " + myAccount.InterestRate(12000, 2, 12));

        // creating new bank account with account number 123456
        Person owner = new Person("Unknown", "User");
        BankAccount user = new BankAccount(123456, owner);

        // printing account details of account 123456
        System.out.println(user);


        // setting address
        Address address = new Address("Beautiful", 3, "Beautiful city", 3642);

        // printing info about bank
        BankAccount bank = new BankAccount("Czech Saving Bank", address.FullAddress());

        System.out.println(bank.BankInfo());
    }
}
