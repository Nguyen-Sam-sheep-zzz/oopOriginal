import java.util.Scanner;

public class danhGiaHocLuc {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Điểm của bạn giới hạn với thang điểm 10 ");
        System.out.println(" Nhập điểm chuyên cần của bạn ");
        int DCC = ip.nextInt();
        System.out.println(" Nhập điểm Ktra giữa kì");
        int KTGK = ip.nextInt();
        System.out.println(" Nhập điểm Ktra học kì ");
        int KTHK = ip.nextInt();
        double DTB = (DCC + KTHK + KTGK) / 3 ;
        if (DTB > 10 ) {
            System.out.println(" Lỗi ");
        }
        else if (DTB >= 8.5) {
            System.out.println("Điểm của bạn xếp loại A ");
        }
        else if (DTB >= 7 ) {
            System.out.println("Điểm của bạn xếp loại B ");
        }
        else if (DTB >= 5.5 ) {
            System.out.println("Điểm của bạn xếp loại C ");
        }
        else if (DTB >= 4 ) {
            System.out.println("Điểm của bạn xếp loại D ");
        }
        else if (DTB < 4 ) {
            System.out.println("Điểm của bạn xếp loại E ");
        }
        else {
            System.out.println("Lỗi");
        }
    }
}
