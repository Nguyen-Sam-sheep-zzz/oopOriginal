package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1_xoaPhanTuKhoiMang {
    public static void main (String[]args){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Nhập độ dài của mảng ");
            int d = sc.nextInt();
            int[] mang = new int[d];
            for (int i = 0; i < mang.length; i++) {
                System.out.println("M[" + i + "]= ");
                mang[i] = sc.nextInt();
            }
            int[] arr_new = new int[mang.length - 1];
            System.out.println("Nhập phần tử x cần xóa ");
            int x = sc.nextInt();
            for (int i = 0; i < mang.length; i++) {
                if (mang[i] == x) {
                    System.out.println("Vị trí của x trong mảng là :" + i);
                }
            }
            for (int i = 0, k = 0; i < mang.length; i++) {
                if (mang[i] != x) {
                    arr_new[k] = mang[i];
                    k++;
                }
            }
            System.out.println(" Mảng sau khi xóa :" + Arrays.toString(arr_new));
            System.out.println("-----------------------------------------------------");
        }
        while (true);
    }
}
