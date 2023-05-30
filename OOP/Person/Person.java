public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = 0;
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    // setting values
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getting values
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    // functions
    public int Birthday() {
        return age += 1;
    }

    @Override
    public String toString() {
        return "Firstname: " + this.getFirstname() + "\nLastname: " + this.getLastname() + "\nAge: " + this.getAge();
    }
}
