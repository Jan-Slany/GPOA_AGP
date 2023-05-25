public class Book {
    private String name;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;

    public Book(String name, String author, int publicationYear, int pages) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = publicationYear;
        this.numberOfPages = pages;
    }

    // setting values
    public void setName(String name) {
        name = name;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        yearOfPublication = yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        numberOfPages = numberOfPages;
    }

    // getting values
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    // functions
    public static int AverageChapterLength(int numberOfPages, int numberOfChapters) {
        return numberOfPages / numberOfChapters;
    }
}
