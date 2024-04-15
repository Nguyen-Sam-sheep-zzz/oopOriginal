package Buoi2;

import java.util.Scanner;

public class hienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100");
        for (int i = 2; i < 100; i++) {
            if (hamkiemtrasnt(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean hamkiemtrasnt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
