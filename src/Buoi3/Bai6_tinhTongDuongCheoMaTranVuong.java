package Buoi3;

import java.util.Scanner;

public class Bai6_tinhTongDuongCheoMaTranVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập mảng 2 chiều mà bạn muốn");
        int a = sc.nextInt();
        int M[][] = new int[a][a];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Mảng vừa nhập M = ");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Nhập số 1 để được đường chéo chính từ trái ");
        System.out.println("Nhập số 2 để được đường chéo chính từ bên phải");
        System.out.println("------------------------------------------------");
        int number = sc.nextInt();
        int sum = 0;
        switch (number) {
            case 1:
                for (int i = 0; i < M.length; i++) {
                    for (int j = 0; j < M.length; j++) {
                        if (i == j) {
                            sum += M[i][j];
                        }
                    }
                }
                System.out.println("Tổng của đường chéo chính trái là = " + sum);
                break;
            case 2:
                for (int x = 0, y = M.length - 1; x < M.length; x++) {
                    sum += M[x][y];
                    y--;
                }
                System.out.println("Tổng đường chéo chính bên phải là = " + sum);
                break;
            default:
                System.out.println("vui lòng chỉ chọn 1 hoặc 2 ");
                break;
        }
    }
}
