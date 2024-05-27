package Buoi7.CaseStudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EBooks Toan = new EBooks(1, "Toan", "Sam", 2010, "cc", 10, "PDF");
        EBooks MeoBeoThickMC = new EBooks(4, "MeoBeoThickMC", "Sam", 2015, "cc", 10, "PDF");
        EBooks TiengVietLop1 = new EBooks(3, "TiengVietLop1", "Sam", 2011, "cc", 10, "PDF");
        EBooks TiengVietLop2 = new EBooks(2, "TiengVietLop2", "Sam", 2014, "cc", 10, "PDF");
        Library LibraryOriginal = new Library();
        LibraryOriginal.addEbooks(Toan);
        LibraryOriginal.addEbooks(MeoBeoThickMC);
        LibraryOriginal.addEbooks(TiengVietLop1);
        LibraryOriginal.addEbooks(TiengVietLop2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ur Library: ");
        System.out.println("Choice 0 to exit");
        System.out.println("Choice 1 to display Ebooks ");
        System.out.println("Choice 2 to add Ebooks ");
        System.out.println("Choice 3 to update information ");
        System.out.println("Choice 4 to remove information ");
        System.out.println("Choice 5 to sort to headline form A to Z ");
        System.out.println("Choice 6 to sort to author form A to Z ");
        System.out.println("Choice 7 to sort to genre form big to small ");
        System.out.println("Choice 8 to sort to year of publication form big to small ");
        System.out.println("Choice 9 to search Ebook with ID ");
        System.out.println("Choice 10 to search Ebook with Headline ");
        do {
            int choice;
            System.out.println("Input ur choice");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    LibraryOriginal.displayAllEBooks();
                    break;
                case 2:
                    System.out.println("Input ID Ebooks ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println("Input Headline Ebooks");
                    String headline = new Scanner(System.in).nextLine();
                    System.out.println("Input Author Ebooks ");
                    String author = new Scanner(System.in).nextLine();
                    System.out.println("Input Genre Ebooks ");
                    String genre = new Scanner(System.in).nextLine();
                    System.out.println("Input Year of publication Ebooks ");
                    int yearOfPublication = new Scanner(System.in).nextInt();
                    System.out.println("Input file size Ebooks ");
                    int fileSize = new Scanner(System.in).nextInt();
                    System.out.println("Input file format Ebooks ");
                    String fileFormat = new Scanner(System.in).nextLine();
                    LibraryOriginal.addEbooks(new EBooks(id, headline, author, yearOfPublication, genre, fileSize, fileFormat));
                    break;
                case 3:
                    System.out.println("Input update information ");
                    int idUpdate = new Scanner(System.in).nextInt();
                    if (!LibraryOriginal.updateWithID(idUpdate)) {
                        System.out.println("not ID found");
                    } else {
                        System.out.println("After update information ");
                        LibraryOriginal.displayAllEBooks();
                    }
                    break;
                case 4:
                    System.out.println("Input remove information ");
                    int idRemove = new Scanner(System.in).nextInt();
                    if (!LibraryOriginal.removeWithID(idRemove)) {
                        System.out.println("not ID found");
                    } else {
                        System.out.println("After remove information ");
                        LibraryOriginal.displayAllEBooks();
                    }
                    break;
                case 5:
                    LibraryOriginal.sortEbooksWithHeadLine(true);
                    LibraryOriginal.displayAllEBooks();
                    break;
                case 6:
                    LibraryOriginal.sortEbooksWithAuthor(true);
                    LibraryOriginal.displayAllEBooks();
                    break;
                case 7:
                    LibraryOriginal.sortEbooksWithGenre(true);
                    LibraryOriginal.displayAllEBooks();
                    break;
                case 8:
                    LibraryOriginal.sortEbooksWithYearOfPublication(true);
                    LibraryOriginal.displayAllEBooks();
                    break;
                case 9:
                    System.out.println("Input id to search Ebook");
                    int idSearch = new Scanner(System.in).nextInt();
                    if (!LibraryOriginal.searchWithID(idSearch)) {
                        System.out.println("not ID found");
                    }

                case 10:
                    System.out.println("Input headline to search Ebook");
                    String headlineToSearch = new Scanner(System.in).nextLine();
                    if (!LibraryOriginal.searchWithHeadline(headlineToSearch)) {
                        System.out.println("not headline found");
                    }
            }
        }
        while (true);
    }
}
