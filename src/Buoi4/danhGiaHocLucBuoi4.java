package Buoi4;

import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class danhGiaHocLucBuoi4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Điểm của bạn giới hạn với thang điểm 10 ");
        System.out.println(" Nhập điểm chuyên cần của bạn ");
        int a = ip.nextInt();
        System.out.println(" Nhập điểm Ktra giữa kì");
        int b = ip.nextInt();
        System.out.println(" Nhập điểm Ktra học kì ");
        int c = ip.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Điểm trung bình của bạn " + tinhDiemTB(a,b,c));
        System.out.println(Display(tinhDiemTB(a,b,c)));
    }
    public static int tinhDiemTB (int DCC , int KTGK , int KTHK) {
        int DTB = (DCC + KTHK + KTGK) / 3;
        return DTB;
    }
    public static String Display(double DTB) {
        if (DTB > 10) {
            return "Lỗi";
        } else if (DTB >= 8.5) {
            return "Điểm của bạn xếp loại A ";
        } else if (DTB >= 7) {
            return "Điểm của bạn xếp loại B ";
        } else if (DTB >= 5.5) {
            return "Điểm của bạn xếp loại C ";
        } else if (DTB >= 4) {
            return "Điểm của bạn xếp loại D ";
        } else if (DTB < 4) {
            return "Điểm của bạn xếp loại E ";
        } else {
            return "Lỗi";
        }
    }
}

