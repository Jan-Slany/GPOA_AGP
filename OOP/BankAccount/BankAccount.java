public class BankAccount {
    private int AccountNumber;
    private String AccountOwner;
    private int AccountBalance;

    public BankAccount(int num, String owner, int balance) {
        this.AccountNumber = num;
        this.AccountOwner = owner;
        this.AccountBalance = balance;
    }

    // setting values
    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setAccountOwner(String accountOwner) {
        AccountOwner = accountOwner;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    // getting values
    public int getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountOwner() {
        return AccountOwner;
    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    // functions
    // requiring account number to verify bank account
    public int Deposit(int amount, int AccountNum) {
        if (this.AccountNumber == AccountNum) return this.AccountBalance += amount;
        else return this.AccountBalance;
    }

    // requiring account number to verify bank account
    public int Withdraw(int amount, int AccountNum) {
        if (this.AccountNumber == AccountNum) return this.AccountBalance -= amount;
        else return this.AccountBalance;
    }
    
    // interest rate 
    public double InterestRate(int amount, double rate, int time) {     
        return (amount * rate * time) / 100;
    }
}
