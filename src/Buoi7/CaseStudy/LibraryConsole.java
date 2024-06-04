package Buoi7.CaseStudy;

import java.util.Scanner;

public class LibraryConsole {
    public void inputHeadlineSByConsole(Library LibraryOriginal) {
        System.out.print("Input headline to search Ebook");
        String headlineToSearch = new Scanner(System.in).nextLine();
        if (!LibraryOriginal.isExist(headlineToSearch)) {
            System.out.println("not ID found");
            return;
        }
        System.out.println(LibraryOriginal.searchWithHeadline(headlineToSearch));
    }

    public void inputIDSByConsole(Library LibraryOriginal) {
        System.out.print("Input id to search Ebook");
        int idSearch = new Scanner(System.in).nextInt();
        if (!LibraryOriginal.isExist(idSearch)) {
            System.out.println("not ID found");
            return;
        }
        System.out.println(LibraryOriginal.searchWithID(idSearch));
    }

    public void inputRIBycosole(Library LibraryOriginal, LibraryConsole Lconsole) {
        System.out.print("Input remove information ");
        int idRemove = new Scanner(System.in).nextInt();
        if (!LibraryOriginal.removeWithID(idRemove)) {
            System.out.println("not ID found");
        } else {
            System.out.println("After remove information ");
            Lconsole.display(LibraryOriginal);
        }
    }

    public void updateIDBycosole(Library LibraryOriginal, LibraryConsole Lconsole) {
        System.out.print("Input update information ");
        int idU = new Scanner(System.in).nextInt();
        if (LibraryOriginal.isExist(idU)) {
            Lconsole.updateIDByCosoleMenu(LibraryOriginal, idU);
            Lconsole.display(LibraryOriginal);
        } else {
            System.out.println("Not id found");
        }
    }

    public void updateIDByCosoleMenu(Library LibraryOriginal, int idU) {
        System.out.print("Input ID ");
        int idUpdate = new Scanner(System.in).nextInt();
        System.out.print("Input Headline ");
        String headlineUpdate = new Scanner(System.in).nextLine();
        System.out.print("Input Author ");
        String authorUpdate = new Scanner(System.in).nextLine();
        System.out.print("Input Genre ");
        String genreUpdate = new Scanner(System.in).nextLine();
        System.out.print("Input Year of publication ");
        int yearOfPublicationUpdate = new Scanner(System.in).nextInt();
        System.out.print("Input file size ");
        int fileSizeUpdate = new Scanner(System.in).nextInt();
        System.out.print("Input file format ");
        String fileFormatUpdate = new Scanner(System.in).nextLine();
        LibraryOriginal.searchWithID(idU).setEbook(idUpdate, headlineUpdate, authorUpdate, genreUpdate, yearOfPublicationUpdate, fileSizeUpdate, fileFormatUpdate);
        System.out.println("After update information ");

    }

    public void display(Library LibraryOriginal) {
        if (LibraryOriginal.getSize() == 0) {
            System.out.println("There is no ebook yet");
        }
        for (int i = 0; i < LibraryOriginal.getSize(); i++) {
            System.out.println(LibraryOriginal.display()[i]);
        }
    }
    public void addByConsole(Library LibraryOriginal) {
        System.out.println("Input ID Ebook ");
        int id = new Scanner(System.in).nextInt();
        while (LibraryOriginal.isExist(id)) {
            System.out.println("this ID have been exist ");
            System.out.print("pls input ID again: ");
            id = new Scanner(System.in).nextInt();
        }
        System.out.print("Input Headline Ebook");
        String headline = new Scanner(System.in).nextLine();
        System.out.print("Input Author Ebook ");
        String author = new Scanner(System.in).nextLine();
        System.out.print("Input Genre Ebook ");
        String genre = new Scanner(System.in).nextLine();
        System.out.print("Input Year of publication Ebook ");
        int yearOfPublication = new Scanner(System.in).nextInt();
        System.out.print("Input file size Ebook ");
        int fileSize = new Scanner(System.in).nextInt();
        System.out.print("Input file format Ebook ");
        String fileFormat = new Scanner(System.in).nextLine();
        LibraryOriginal.addEbook(new Ebook(id, headline, author, yearOfPublication, genre, fileSize, fileFormat));
    }
    public int menu() {
        System.out.println("Ur Library: ");
        System.out.println("Choice 0 to exit");
        System.out.println("Choice 1 to display Ebook ");
        System.out.println("Choice 2 to add Ebook ");
        System.out.println("Choice 3 to update information ");
        System.out.println("Choice 4 to remove information ");
        System.out.println("Choice 5 to sort to headline form A to Z ");
        System.out.println("Choice 6 to sort to author form A to Z ");
        System.out.println("Choice 7 to sort to genre form A to Z ");
        System.out.println("Choice 8 to sort to year of publication form big to small ");
        System.out.println("Choice 9 to search Ebook with ID ");
        System.out.println("Choice 10 to search Ebook with Headline ");
        System.out.println("Input ur choice");
        return new Scanner(System.in).nextInt();
    }
}
