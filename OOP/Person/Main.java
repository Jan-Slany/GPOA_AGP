public class Main {
  public static void main(String[] args) {
    Person person = new Person("Jan", "Slaný", 17);

    System.out.println(person);

    System.out.println("\nHappy " + person.Birthday() + "th birthday!\n");

    System.out.println(person);
  }
}
