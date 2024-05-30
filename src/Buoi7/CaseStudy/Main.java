package Buoi7.CaseStudy;
public class Main {
    public static void main(String[] args) {
        LibraryConsole Lconsole = new LibraryConsole();
        Ebook Toan = new Ebook(1, "Toan", "Sam", 2010, "Fiction", 10, "PDF");
        Ebook MeoBeoThickMC = new Ebook(4, "MeoBeoThickMC", "Khanh", 2015, "Romance", 10, "PDF");
        Ebook TiengVietLop1 = new Ebook(3, "TiengVietLop1", "Chanh", 2011, "Fantasy", 10, "PDF");
        Ebook TiengVietLop2 = new Ebook(2, "TiengVietLop2", "Nhan", 2014, "Fantasy", 10, "PDF");
        Library LibraryOriginal = new Library();
        LibraryOriginal.addEbook(Toan);
        LibraryOriginal.addEbook(MeoBeoThickMC);
        LibraryOriginal.addEbook(TiengVietLop1);
        LibraryOriginal.addEbook(TiengVietLop2);
        do {
            int choice = Lconsole.menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Lconsole.display(LibraryOriginal);
                    break;
                case 2:
                    Lconsole.addByConsole(LibraryOriginal);
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
        while (true);
    }
}
