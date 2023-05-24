public class Employee {
    private String Name;
    private String Position;
    private int Salary;

    public Employee(String name, String position, int salary) {
        this.Name = name;
        this.Position = position;
        this.Salary = salary;
    }

    // setting values
    public void setName(String name) {
        Name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    // getting values
    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public int getSalary() {
        return Salary;
    }

    // functions
    public static double IncreaseSalaryCoefficient(int salary, double coefficient) {
        return salary * coefficient;
    }
}
