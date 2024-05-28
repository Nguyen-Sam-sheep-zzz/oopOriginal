package Buoi7.CaseStudy;

public class Ebook extends Book {
    int FileSize;
    String FileFormat;
    public Ebook(int ID, String Headline, String Author,int  YearOfPublication , String Genre, int FileSize, String FileFormat) {
        super(ID, Headline, Author, YearOfPublication,Genre);
        this.FileFormat = FileFormat;
        this.FileSize = FileSize;
    }
    public void setEbook(int id, String headline, String author, String genre, int yearOfPublication, int fileSize, String fileFormat ) {
        ID = id;
        Headline = headline;
        Author = author;
        Genre = genre;
        YearOfPublication = yearOfPublication;
        FileSize = fileSize;
        FileFormat = fileFormat;
    }
}
