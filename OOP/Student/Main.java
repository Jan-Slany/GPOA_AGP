public class Main {
    public static void main(String[] args) {
        Student stud = new Student("Jan", "Slaný", 2006, 2);

        System.out.println(
                "First name: " + stud.getFirstName() +
                        "\nLast name: " + stud.getLastName() +
                        "\nYear of birth: " + stud.getBirthDate() +
                        "\nAverage mark: " + stud.getAverageMark()
        );

        System.out.printf("\nAverage mark: %.2f", stud.MarkAverage(new int[]{1, 3, 2, 3, 2, 2}));
    }
}
