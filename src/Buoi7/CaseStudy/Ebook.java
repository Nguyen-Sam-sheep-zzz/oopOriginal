package Buoi7.CaseStudy;

public class Ebook extends Book {
    private int FileSize;
    private String FileFormat;


    public Ebook(int ID, String Headline, String Author, int YearOfPublication, String Genre, int FileSize, String FileFormat) {
        super(ID, Headline, Author, YearOfPublication, Genre);
        this.FileFormat = FileFormat;
        this.FileSize = FileSize;
    }

    public void setEbook(int id, String headline, String author, String genre, int yearOfPublication, int fileSize, String fileFormat) {
        setAll(id, headline, author, genre, yearOfPublication);
        setFileSize(fileSize);
        setFileFormat(fileFormat);
    }

    public int getFileSize() {
        return FileSize;
    }

    public void setFileSize(int fileSize) {
        FileSize = fileSize;
    }

    public String getFileFormat() {
        return FileFormat;
    }

    public void setFileFormat(String fileFormat) {
        FileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "ID: " + getID()
                + "  |  Author: " + getAuthor()
                + "  |  Headline: " + getHeadline()
                + "  |  Genre: " + getGenre()
                + "  |  Year Of Publication: " + getYearOfPublication()
                + "  |  File size: " + getFileSize()
                + "  |  File format: " + getFileFormat();
    }
}
