import org.w3c.dom.ls.LSOutput;
import package_PP.BankAccount;
import package_PP.Person;

public class main {
    public static void main(String[] args) {
        // Zde naimplementujte komunikaci.
        // RČ (rok)85(měsíc)05(den)30(čtyřčíslí vygenerované)2589, nerozlišujeme pohlaví

        // 1) Vytvořte 3 lidi:

        // i) Petr, RČ 9510184289, Moravské Budějovice
        Person user_1 = new Person("9510184289","Petr", "Moravské Budějovice");

        // ii) Jakub, RČ 5502274976, Praha
        Person user_2 = new Person("5502274976", "Jakub", "Praha");

        // iii) Karolína, RČ 0912095186, Znojmo
        Person user_3 = new Person("0912095186","Karolína", "Znojmo");

        //?*) František, RČ 5902311485, Neznámo odkud -> Překontrolujte, že údaje jsou validní v rámci kódu (RČ)
        Person user_4 = new Person("5902311485","František",null);


        // 2) Vypište všechny 3 validní osoby pomocí metody toString. (stačí pouze napsat System.out.println(name_of_object_Person)
        System.out.println(user_1);
        System.out.println(user_2);
        System.out.println(user_3);
        System.out.println(user_4);


        // 3) Nechte pozdravit Petra Karolínu
        System.out.println(user_1.sayHi(user_3));


        // Bankovní účty
        //4) Vytvořte bankovní účet pro objekt, kterým je Petr, RČ 9510184289, Moravské Budějovice. Jde o nový účet, nemá žádný původní zůstatek.
        BankAccount bank_user_1 = new BankAccount(user_1);

        // 5) Vytvořte bankovní účet pro objekt, kterým je Jakub, RČ 5502274976, Praha. Jakub má převedený účet a jeho úvodní zůstatek činí 12 598,-.
        BankAccount bank_user_2 = new BankAccount(user_2,12598);

        // 6) Vypište současný stav obou účtů pomocí toString (stačí pouze napsat System.out.println(name_of_object_BankAccount).
        System.out.println(bank_user_1);
        System.out.println(bank_user_2);


        // 7) Jakub nyní bude pracovat se svým účtem. U všech akcí vypište, zda se provedla, či nikoliv
        // (System.out.println(name_of_object_BankAccount.depositMoney(20000)) -> vytiskne false)
        // (System.out.println(name_of_object_BankAccount.withdrawMoney(5000)) -> vytiskne true)

        // i) Jakub se pokusí vložit 20 000,-
        System.out.println(bank_user_2.depositMoney(20000));

        // ii) vybere 5 000,-
        System.out.println(bank_user_2.withdrawMoney(5000));

        // iii) vloží 1 000,-
        System.out.println(bank_user_2.depositMoney(1000));

        // iv) pokusí se vybrat 10 000,-
        System.out.println(bank_user_2.withdrawMoney(10000));


        // 8) Vypište současný stav obou účtů pomocí toString (stačí pouze napsat System.out.println(name_of_object_BankAccount).
        System.out.println(bank_user_1);
        System.out.println(bank_user_2);


        /*
        hrubý očekávaný výstup z metody main:
        Osoby...
        Jméno: Petr; Bydliště: Moravské Budějovice; Věk: 27
        Jméno: Jakub; Bydliště: Praha; Věk: 68
        Jméno: Karolína; Bydliště: Znojmo; Věk: 13
        Petr: Aá, Karolína. Dlouho jsme se neviděli, doufám, že se máš ve věku 13 dobře. Přeji ti hezký den a užívej si sluníčko.
        Účty...
        Jméno: Petr; Bydliště: Moravské Budějovice; Číslo účtu: 689521; Zůstatek: 0
        Jméno: Jakub; Bydliště: Praha; Číslo účtu: 281799; Zůstatek: 12598
        false
        true
        true
        false
        Jméno: Petr; Bydliště: Moravské Budějovice; Číslo účtu: 689521; Zůstatek: 0
        Jméno: Jakub; Bydliště: Praha; Číslo účtu: 281799; Zůstatek: 8598
         */
    }
}
