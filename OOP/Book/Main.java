public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Chronicles of Narnia: Prince Caspian", "Clive Staples Lewis", 2016, 240);

        System.out.println(
                "Name: " + book.getName() +
                "\nAuthor: " + book.getAuthor() +
                "\nPublication year: " + book.getYearOfPublication() +
                "\nPages: " + book.getNumberOfPages()
        );

        System.out.printf("\nAverage chapter length is %d pages", book.AverageChapterLength(book.getNumberOfPages(), 15));
    }
}
