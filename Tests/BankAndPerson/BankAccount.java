package package_PP;

public class BankAccount {
    // implementujte 3 atributy: číslo účtu, osoba (objekt třídy Person), zůstatek
    private long accountNumber;
    private double balance;
    private final String person;
    private final String address;


    // implementujte konstruktor s parametry: osoba (objekt třídy Person). číslo účtu vygenerujte jako 6 místné číslo,
    // zůstatek nastavte na 0.
    public BankAccount(Person person){
        // getting person name
        this.person = person.getName();
        this.accountNumber = (int)(Math.random() * 10000 + 99999);
        this.balance = 0;
        // getting address value
        this.address = person.getAddress();
    }

    // implementujte konstruktor s parametry: osoba (objekt třídy Person) a zůstatek. číslo účtu vygenerujte jako 6
    // místné číslo, zůstatek nastavte na předaný parametr.
    public BankAccount(Person person, int balance){
        // getting person name
        this.person = person.getName();
        this.balance = balance;
        this.accountNumber = (int)(Math.random() * 100000 + 999999);
        // getting address value
        this.address = person.getAddress();
    }


    // implementujte get a set pro atributy, uvědomte si které lze měnit

    // setting values
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getting values
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPerson() {
        return person;
    }

    public String getAddress() { return address; }


    // implementujte metodu toSting, ta bude vracet řetězec ve formátu:
    // "Jméno: attr_osoba.name; Bydliště: attr_osoba.homeTown; Číslo účtu: attr_accNumber; Zůstatek: attr_balance"
    @Override
    public String toString() {
        return "Jméno: " + this.getPerson() + " Bydliště: " + this.getAddress() + " Číslo účtu: " + this.getAccountNumber() + " Zůstatek: " + this.getBalance();
    }

    // implementujte metodu pro vklad peněz na účet s parametrem: částka. Maximální vklad je 10 000,- -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean depositMoney(int amount) {
        if (amount <= 10000) {
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    // implementujte metodu pro výběr peněz na účet s parametrem: částka. Maximální výběr je 10 000,- -> Ošetřete.
    // A nesmíte se dostat do záporných částek -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean withdrawMoney(int amount) {
        if (amount <= 10000 && this.balance > amount) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
