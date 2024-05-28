package Buoi7.CaseStudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ebook Toan = new Ebook(1, "Toan", "Sam", 2010, "Fiction", 10, "PDF");
        Ebook MeoBeoThickMC = new Ebook(4, "MeoBeoThickMC", "Khanh", 2015, "Romance", 10, "PDF");
        Ebook TiengVietLop1 = new Ebook(3, "TiengVietLop1", "Chanh", 2011, "Fantasy", 10, "PDF");
        Ebook TiengVietLop2 = new Ebook(2, "TiengVietLop2", "Nhan", 2014, "Fantasy", 10, "PDF");
        Library LibraryOriginal = new Library();
        LibraryOriginal.addEbook(Toan);
        LibraryOriginal.addEbook(MeoBeoThickMC);
        LibraryOriginal.addEbook(TiengVietLop1);
        LibraryOriginal.addEbook(TiengVietLop2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ur Library: ");
        System.out.println("Choice 0 to exit");
        System.out.println("Choice 1 to display Ebook ");
        System.out.println("Choice 2 to add Ebook ");
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
                    display(LibraryOriginal);
                    break;
                case 2:
                    System.out.println("Input ID Ebook ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println("Input Headline Ebook");
                    String headline = new Scanner(System.in).nextLine();
                    System.out.println("Input Author Ebook ");
                    String author = new Scanner(System.in).nextLine();
                    System.out.println("Input Genre Ebook ");
                    String genre = new Scanner(System.in).nextLine();
                    System.out.println("Input Year of publication Ebook ");
                    int yearOfPublication = new Scanner(System.in).nextInt();
                    System.out.println("Input file size Ebook ");
                    int fileSize = new Scanner(System.in).nextInt();
                    System.out.println("Input file format Ebook ");
                    String fileFormat = new Scanner(System.in).nextLine();
                    LibraryOriginal.addEbook(new Ebook(id, headline, author, yearOfPublication, genre, fileSize, fileFormat));
                    break;
                case 3:
                    System.out.println("Input update information ");
                    int idU = new Scanner(System.in).nextInt();
                    if (LibraryOriginal.isExist(idU)) {
                        System.out.println("Input ID ");
                        int idUpdate = new Scanner(System.in).nextInt();
                        System.out.println("Input Headline ");
                        String headlineUpdate = new Scanner(System.in).nextLine();
                        System.out.println("Input Author ");
                        String authorUpdate = new Scanner(System.in).nextLine();
                        System.out.println("Input Genre ");
                        String genreUpdate = new Scanner(System.in).nextLine();
                        System.out.println("Input Year of publication ");
                        int yearOfPublicationUpdate = new Scanner(System.in).nextInt();
                        System.out.println("Input file size ");
                        int fileSizeUpdate = new Scanner(System.in).nextInt();
                        System.out.println("Input file format ");
                        String fileFormatUpdate = new Scanner(System.in).nextLine();
                        LibraryOriginal.updateWithID(idUpdate, headlineUpdate, authorUpdate, genreUpdate, yearOfPublicationUpdate, fileSizeUpdate, fileFormatUpdate);
                        System.out.println("After update information ");
                        display(LibraryOriginal);
                        break;
                    } else {
                        System.out.println("Not id found");
                    }
                    break;
                case 4:
                    System.out.println("Input remove information ");
                    int idRemove = new Scanner(System.in).nextInt();
                    if (!LibraryOriginal.removeWithID(idRemove)) {
                        System.out.println("not ID found");
                    } else {
                        System.out.println("After remove information ");
                        display(LibraryOriginal);
                    }
                    break;
                case 5:
                    LibraryOriginal.sortEbookWithHeadLine(true);
                    display(LibraryOriginal);

                    break;
                case 6:
                    LibraryOriginal.sortEbookWithAuthor(true);
                    display(LibraryOriginal);

                    break;
                case 7:
                    LibraryOriginal.sortEbookWithGenre(true);
                    display(LibraryOriginal);

                    break;
                case 8:
                    LibraryOriginal.sortEbookWithYearOfPublication(true);
                    display(LibraryOriginal);

                    break;
                case 9:
                    System.out.println("Input id to search Ebook");
                    int idSearch = new Scanner(System.in).nextInt();
                    if (!LibraryOriginal.isExist(idSearch)) {
                        System.out.println("not ID found");
                        break;
                    }
                    System.out.println(LibraryOriginal.searchWithID(idSearch));
                case 10:
                    System.out.println("Input headline to search Ebook");
                    String headlineToSearch = new Scanner(System.in).nextLine();
                    if (!LibraryOriginal.isExist(headlineToSearch)) {
                        System.out.println("not ID found");
                        break;
                    }
                    System.out.println(LibraryOriginal.searchWithHeadline(headlineToSearch));
            }
        }
        while (true);
    }

    public static void display(Library LibraryOriginal) {
        for (int i = 0; i < LibraryOriginal.getSize(); i++) {
            System.out.println(LibraryOriginal.display()[i]);
        }
    }
}
