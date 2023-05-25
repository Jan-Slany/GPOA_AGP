public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // setting values
    public void setName(String name) {
        name = name;
    }

    public void setPosition(String position) {
        position = position;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    // getting values
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    // functions
    public static double IncreaseSalaryCoefficient(int salary, double coefficient) {
        return salary * coefficient;
    }
}
