public class BankAccount {
    private int accountNumber;
    private String accountOwner;
    private int accountBalance;

    public BankAccount(int num, String owner, int balance) {
        this.accountNumber = num;
        this.accountOwner = owner;
        this.accountBalance = balance;
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
        return accountOwner;
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
}
