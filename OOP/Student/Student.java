public class Student {
  private String firstName;
  private String lastName;
  private int birthDate;
  private double averageMark;

  public Student(String first, String last, int birth, double averageMark) {
    this.firstName = first;
    this.lastName = last;
    this.birthDate = birth;
    this.averageMark = averageMark;
  }

  // setting values
  public void setFirstName(String firstName) {
    firstName = firstName;
  }

  public void setLastName(String lastName) {
    lastName = lastName;
  }

  public void setBirthDate(int birthDate) {
    birthDate = birthDate;
  }

  public void setAverageMark(double averageMark) {
    averageMark = averageMark;
  }

  // getting values
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getBirthDate() {
    return birthDate;
  }

  public double getAverageMark() {
    return averageMark;
  }

  // functions
  public static double MarkAverage(int[] marks) {
    double sum = 0;
    for (double i : marks) sum += i;
    return sum / marks.length;
  }
}
