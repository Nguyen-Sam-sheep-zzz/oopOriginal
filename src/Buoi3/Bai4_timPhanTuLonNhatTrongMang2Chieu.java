package Buoi3;

import java.util.Scanner;

public class Bai4_timPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng");
        int d = sc.nextInt();
        System.out.println("Nhập số cột của mảng ");
        int c = sc.nextInt();
        int M[][] = new int[d][c];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
        int max = M[0][0];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                if (max < M[i][j]) {
                    max = M[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max);
    }
}
