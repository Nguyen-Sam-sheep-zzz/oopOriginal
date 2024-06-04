package Buoi7.CaseStudy;

public class Main {
    public static void main(String[] args) {
        LibraryConsole Lconsole = new LibraryConsole();
        Library LibraryOriginal = new Library();
        while (true) {
            int choice = Lconsole.menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Lconsole.display(LibraryOriginal);
                    break;
                case 2:
                    Lconsole.addByConsole(LibraryOriginal);
                    Lconsole.display(LibraryOriginal);
                    break;
                case 3:
                    Lconsole.updateIDBycosole(LibraryOriginal, Lconsole);
                    break;
                case 4:
                    Lconsole.inputRIBycosole(LibraryOriginal, Lconsole);
                    break;
                case 5:
                    LibraryOriginal.sortEbookWithHeadLine(true);
                    Lconsole.display(LibraryOriginal);
                    break;
                case 6:
                    LibraryOriginal.sortEbookWithAuthor(true);
                    Lconsole.display(LibraryOriginal);
                    break;
                case 7:
                    LibraryOriginal.sortEbookWithGenre(true);
                    Lconsole.display(LibraryOriginal);
                    break;
                case 8:
                    LibraryOriginal.sortEbookWithYearOfPublication(true);
                    Lconsole.display(LibraryOriginal);
                    break;
                case 9:
                    Lconsole.inputIDSByConsole(LibraryOriginal);
                    break;
                case 10:
                    Lconsole.inputHeadlineSByConsole(LibraryOriginal);
                    break;
            }
        }
    }
}
