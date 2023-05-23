public class Student {
  private String FirstName;
  private String LastName;
  private int BirthDate;
  private double AverageMark;

  public Student(String first, String last, int birth, double averageMark) {
    this.FirstName = first;
    this.LastName = last;
    this.BirthDate = birth;
    this.AverageMark = averageMark;
  }

  // setting values
  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public void setBirthDate(int birthDate) {
    BirthDate = birthDate;
  }

  public void setAverageMark(double averageMark) {
    AverageMark = averageMark;
  }

  // getting values
  public String getFirstName() {
    return FirstName;
  }

  public String getLastName() {
    return LastName;
  }

  public int getBirthDate() {
    return BirthDate;
  }

  public double getAverageMark() {
    return AverageMark;
  }

  // functions
  public static double MarkAverage(int[] marks) {
    double sum = 0;
    for (double i : marks) sum += i;
    return sum / marks.length;
  }
}
