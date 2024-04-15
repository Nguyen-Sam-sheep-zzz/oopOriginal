package Buoi3;

import java.util.Scanner;

public class TH4_ungDungDemSinhVienDo {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập chiều dài mảng");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Chiều dài mảng không thể lớn hơn 20");
            }
        } while (size > 20);
        int M[] = new int[size];
        int i = 0;
        while ( i  < M.length) {
            System.out.print("Nhập điểm cho học sinh " + (i + 1 ) + ": " );
            M[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        for (int j = 0; j < M.length; j++) {
            System.out.println(M[j] + "\t");
            if (M[j] >= 5 && M[j] <= 10) {
                count++;
            }
        }
        System.out.println(" Số học sinh vượt qua bài kiểm tra là " + count);
    }
}

