package Buoi4;

import java.util.Scanner;

public class hienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N số nguyên tố muốn hiển thị ");
        int n = sc.nextInt();
        displayNSoNguyenTo(n);
    }
    public static void displayNSoNguyenTo(int n) {
        int first = 0;
        int i = 2;
        System.out.println(" Số nguyên tố: ");
        while (first < n) {
            if(laSoNguyenTo(i)) {
                System.out.println(i + " ");
                first ++;
            }
            i++;
        }
    }
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
