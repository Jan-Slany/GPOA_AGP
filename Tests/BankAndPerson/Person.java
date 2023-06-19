package package_PP;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
    // implementujte 3 atributy: RČ, Jméno, Bydliště (město stačí), Věk

    private String birthNumber;
    private String name;
    private String address;
    private final int age;


    // implementujte konstruktor s parametry: RČ, Jméno, Bydliště. Věk vypočtěte z rodného čísla.
    public Person(String birthNumber, String name, String address){
        this.birthNumber = birthNumber;
        this.name = name;
        this.address = address;

        // by Fabjjn
        if (Integer.parseInt(birthNumber.substring(0,2)) < 23) {
            if (Integer.parseInt(birthNumber.substring(2,4)) > 6) age = 23 - Integer.parseInt(birthNumber.substring(0,2)) - 1;
            else age = 23 - Integer.parseInt(birthNumber.substring(0,2));
        }
        else {
            if (Integer.parseInt(birthNumber.substring(2,4)) > 6) age = 123 - Integer.parseInt(birthNumber.substring(0,2)) - 1;
            else age = 123 - Integer.parseInt(birthNumber.substring(0,2));
        }
    }

    // implementujte get a set pro atributy, uvědomte si které lze měnit

    // setting values
    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getting values
    public String getBirthNumber() {
        return birthNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    // implementujte metodu toSting, ta bude vracet řetězec ve formátu: "Jméno: attr_name; Bydliště: attr_homeTown; Věk: attr_age"
    @Override
    public String toString(){
        // setting date format to check is date is valid
        String dateFormat = "MMdd";

        try {
            SimpleDateFormat validDate = new SimpleDateFormat(dateFormat);
            validDate.setLenient(false);
            validDate.parse(this.birthNumber.substring(2,6));
        }
        catch (ParseException | IllegalArgumentException e) {
            return "Uživatel " + this.getName() + " nemá validní RČ\n";
        }
        return "Jméno: " + this.name + "\nBydliště: " + this.address + "\nVěk: " + this.age + "\n";
    }


    // implementujte metodu sayHi, která jako vstupní parametr dostane objekt třídy Person (člověka).
    // Daného člověka následně osloví a popřeje mu hezký den. Například:
    // "Jan: Aá, František. Dlouho jsme se neviděli, doufám, že se máš ve věku 32 dobře.
    // Přeji ti hezký den a užívej si sluníčko."
    public String sayHi(Person otherPerson){
        return this.getName() + ": Aá, " + otherPerson.getName() + ". Dlouho jsme se neviděli, doufám, že se máš ve věku " + otherPerson.getAge() + " dobře. Přeji ti hezký den a užívej si sluníčko.\n";
    }
}
