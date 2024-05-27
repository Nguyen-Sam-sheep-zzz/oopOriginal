package Buoi7.CaseStudy;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Library {
    EBooks[] listEbooks = new EBooks[0];

    public void addEbooks(EBooks newEBooks) {
        EBooks[] newListEbook = new EBooks[listEbooks.length + 1];
        newListEbook[newListEbook.length - 1] = newEBooks;
        System.arraycopy(listEbooks, 0, newListEbook, 0, listEbooks.length);
        listEbooks = newListEbook;
    }

    public void displayAllEBooks() {
        for (EBooks books : listEbooks) {
            System.out.println(books.toString());
        }
    }

    public boolean updateWithID(int ID) {
        for (EBooks listEbook : listEbooks) {
            if (listEbook.getID() == ID) {
                System.out.println("Input ID Ebooks ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Input Headline ");
                String headline = new Scanner(System.in).nextLine();
                System.out.println("Input Author ");
                String author = new Scanner(System.in).nextLine();
                System.out.println("Input Genre ");
                String genre = new Scanner(System.in).nextLine();
                System.out.println("Input Year of publication ");
                int yearOfPublication = new Scanner(System.in).nextInt();
                System.out.println("Input file size ");
                int fileSize = new Scanner(System.in).nextInt();
                System.out.println("Input file format ");
                String fileFormat = new Scanner(System.in).nextLine();
                listEbook.setALlEBooks(id, headline, author, genre, yearOfPublication, fileSize, fileFormat);
                return true;
            }
        }
        return false;
    }

    public boolean removeWithID(int removeID) {
        for (int i = 0; i < listEbooks.length; i++) {
            if (listEbooks[i].getID() == removeID) {
                EBooks[] newBook = new EBooks[listEbooks.length - 1];
                System.arraycopy(listEbooks, 0, newBook, 0, i);
                System.arraycopy(listEbooks, i + 1, newBook, i, listEbooks.length - i - 1);
                listEbooks = newBook;
                return true;
            }
        }
        return false;
    }

    public void sortEbooksWithHeadLine(boolean ascending) {
        Comparator<EBooks> comparator = Comparator.comparing(EBooks::getHeadline);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbooks, comparator);
    }

    public void sortEbooksWithAuthor(boolean ascending) {
        Comparator<EBooks> comparator = Comparator.comparing(EBooks::getAuthor);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbooks, comparator);
    }

    public void sortEbooksWithYearOfPublication(boolean ascending) {
        Comparator<EBooks> comparator = Comparator.comparing(EBooks::getYearOfPublication);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbooks, comparator);
    }

    public void sortEbooksWithGenre(boolean ascending) {
        Comparator<EBooks> comparator = Comparator.comparing(EBooks::getGenre);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbooks, comparator);
    }

    public void displayiEbooks(EBooks i) {
        System.out.println("Book{" +
                "ID=" + i.getID() +
                ", Headline='" + i.getHeadline() + '\'' +
                ", Author='" + i.Author + '\'' +
                ", Genre='" + i.getGenre() + '\'' +
                ", YearOfPublication=" + i.getYearOfPublication() +
                '}');
    }

    public boolean searchWithID(int ID) {
        for (EBooks listEbook1 : listEbooks) {
            if (listEbook1.getID() == ID) {
                displayiEbooks(listEbook1);
                return true;
            }
        }
        return false;
    }

    public boolean searchWithHeadline(String Headline) {
        for (EBooks listEbook : listEbooks) {
            if (listEbook.getHeadline().equalsIgnoreCase(Headline)) {
                displayiEbooks(listEbook);
                return true;
            }
        }
        return false;
    }
}
