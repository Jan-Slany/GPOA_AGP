public class Book {
    private String Name;
    private String Author;
    private int YearOfPublication;
    private int NumberOfPages;

    public Book(String name, String author, int publicationYear, int pages) {
        this.Name = name;
        this.Author = author;
        this.YearOfPublication = publicationYear;
        this.NumberOfPages = pages;
    }

    // setting values
    public void setName(String name) {
        Name = name;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        YearOfPublication = yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
    }

    // getting values
    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    // functions
    public static int AverageChapterLength(int numberOfPages, int numberOfChapters) {
        return numberOfPages / numberOfChapters;
    }
}
