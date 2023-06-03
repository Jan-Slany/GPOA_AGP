public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String bankName;
    private int[] accounts;
    private String person;
    private String address;

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

    public BankAccount(String bankName, String address) {
        this.bankName = bankName;
        // getting address from address class
        this.address = address;
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

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public String getBankName() {
        return bankName;
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

    public String BankInfo() {
        return "Bank name: " + this.getBankName() +
                "\nAddress: " + this.address;
    }

    @Override
    public String toString() {
        return "Account number: " + this.getAccountNumber() +
                "\nOwner: " + this.getAccountOwner() +
                "\nBalance: " + this.getAccountBalance() + "\n";
    }
}
