public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String person;

    public BankAccount(int num, Person owner, int balance) {
        this.accountNumber = num;
        // getting full name from person class
        this.person = owner.FullName();
        this.accountBalance = balance;
    }

    public BankAccount(int num, Person owner) {
        this.accountNumber = num;
        this.person = owner.FullName();
        // setting account balance to default value
        this.accountBalance = 0;
    }

    // setting values
    public void setAccountNumber(int accountNumber) {
        accountNumber = accountNumber;
    }

    public void setAccountOwner(String accountOwner) {
        accountOwner = accountOwner;
    }

    public void setAccountBalance(int accountBalance) {
        accountBalance = accountBalance;
    }

    // getting values
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return person;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    // functions
    // requiring account number to verify bank account
    public int Deposit(int amount, int accountNum) {
        if (this.accountNumber == accountNum) return this.accountBalance += amount;
        else return this.accountBalance;
    }

    // requiring account number to verify bank account
    public int Withdraw(int amount, int accountNum) {
        if (this.accountNumber == accountNum) return this.accountBalance -= amount;
        else return this.accountBalance;
    }

    // interest rate
    public double InterestRate(int amount, double rate, int time) {
        return (amount * rate * time) / 100;
    }

    @Override
    public String toString() {
        return "Account number: " + this.getAccountNumber() +
                "\nOwner: " + this.getAccountOwner() +
                "\nBalance: " + this.getAccountBalance() + "\n";
    }
}
