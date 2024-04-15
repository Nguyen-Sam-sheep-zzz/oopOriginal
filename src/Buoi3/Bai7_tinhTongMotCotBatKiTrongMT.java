package Buoi3;

import java.util.Scanner;

public class Bai7_tinhTongMotCotBatKiTrongMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng ");
        int d = sc.nextInt();
        System.out.println("Nhập số cột của mảng");
        int c = sc.nextInt();
        int M[][] = new int[d][c];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng của bạn là: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Nhập số cột cần tính tổng ");
        int t = sc.nextInt();
        int sum = 0 ;
        t = t - 1;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                if( t == j) {
                    sum += M[i][j];
                }
            }
        }
        System.out.println("Tổng của cột trong mảng của bạn = " + sum);
    }
}
