package Buoi1;

import java.util.Scanner;

public class chuyenChuThanhSo {
    private static final String[] muoisodau = {
            "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám ", "chín"
    };

    public static String chuyenTuSoThanhChu(int input) {
        if (input == 0) {
            return muoisodau[0];
        }
        StringBuilder dapan = new StringBuilder();
        int hangtram = input / 100;
        int hangchuc = (input % 100) / 10;
        int hangdvi = input % 10;
        if (hangtram > 0) {
            dapan.append(muoisodau[hangtram]).append(" trăm");
        }
        if (hangchuc > 0) {
            if (hangtram > 0) {
                dapan.append(" ");
            }
            if (hangchuc == 1) {
                dapan.append("mười");
            } else {
                dapan.append(muoisodau[hangchuc]).append(" mươi");
            }
        }

        if (hangdvi > 0) {
            if (hangchuc == 0) {
                dapan.append(" linh");
            }
            dapan.append(" ").append(muoisodau[hangdvi]);
        }
        return dapan.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số của bạn");
        int input = sc.nextInt();
        String chu = chuyenTuSoThanhChu(input);
        System.out.println("Số của bạn " + input + " đã chuyển thành chữ: " + chu );
    }
}
