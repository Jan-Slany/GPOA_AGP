public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("Jan Slaný", "Java developer", 32000);

    // employee details
    System.out.println(
      "Name: " + employee.getName() +
      "\nPosition: " + employee.getPosition() +
      "\nSalary: " + employee.getSalary()
    );

    System.out.println("\nSalary increase according to the percentage coefficient: " + employee.IncreaseSalaryCoefficient(employee.getSalary(), 1.02));
  }
}
