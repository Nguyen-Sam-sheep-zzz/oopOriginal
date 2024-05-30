package Buoi7.CaseStudy;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    final int MaxLimit = 1000;
    Ebook[] listEbook = new Ebook[MaxLimit];
    private int count = 0;

    public void addEbook(Ebook newEbook) {
        if (this.count >= MaxLimit) {
            return;
        }
        this.listEbook[count++] = newEbook;
    }

    public Ebook[] display() {
        return listEbook;
    }

    public int getSize() {
        return listEbook.length;
    }

    public boolean removeWithID(int removeID) {
        for (int i = 0; i < listEbook.length; i++) {
            if (listEbook[i].getID() == removeID) {
                Ebook[] newBook = new Ebook[listEbook.length - 1];
                System.arraycopy(listEbook, 0, newBook, 0, i);
                System.arraycopy(listEbook, i + 1, newBook, i, listEbook.length - i - 1);
                listEbook = newBook;
                return true;
            }
        }
        return false;
    }

    public void Comparator(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getHeadline);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbook, comparator);
    }

    public void sortEbookWithHeadLine(boolean ascending) {
        Comparator(ascending);
    }

    public void sortEbookWithAuthor(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getAuthor);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbook, comparator);
    }

    public void sortEbookWithYearOfPublication(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getYearOfPublication);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbook, comparator);
    }

    public void sortEbookWithGenre(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getGenre);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listEbook, comparator);
    }

    public Ebook searchWithID(int ID) {
        for (Ebook listEbook1 : listEbook) {
            if (listEbook1.getID() == ID) {
                return listEbook1;
            }
        }
        return null;
    }

    public Ebook searchWithHeadline(String Headline) {
        for (Ebook listEbook : listEbook) {
            if (listEbook.getHeadline().equalsIgnoreCase(Headline)) {
                return listEbook;
            }
        }
        return null;
    }

    public boolean isExist(int id) {
        for (Ebook e : listEbook) {
            if (e.getID() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isExist(String headline) {
        for (Ebook e : listEbook) {
            if (e.getHeadline().equalsIgnoreCase(headline)) {
                return true;
            }
        }
        return false;
    }
}
