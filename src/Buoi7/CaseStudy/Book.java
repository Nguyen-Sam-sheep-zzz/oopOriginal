package Buoi7.CaseStudy;

public class Book {
    private int ID;
    private String Headline;
    private String Author;
    private String Genre;
    private int YearOfPublication;

    public Book(int ID, String Headline, String Author, int YearOfPublication, String Genre) {
        this.ID = ID;
        this.Headline = Headline;
        this.Author = Author;
        this.YearOfPublication = YearOfPublication;
        this.Genre = Genre;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }

    public int getID() {
        return ID;
    }

    public String getHeadline() {
        return Headline;
    }

    public String getAuthor() {
        return Author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setHeadline(String headline) {
        Headline = headline;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setAll(int id, String headline, String author, String genre, int yearOfPublication) {
        ID = id;
        Headline = headline;
        Author = author;
        Genre = genre;
        YearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", Headline='" + Headline + '\'' +
                ", Author='" + Author + '\'' +
                ", Genre='" + Genre + '\'' +
                ", YearOfPublication=" + YearOfPublication +
                '}';
    }
}
