package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class TH3_timGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập chiều dài của mảng ");
        int n = sc.nextInt();
        int[]M = new int[n];
        int max = M[0];
        int index = 1;
        if (n <= 20) {
            for (int i = 0; i < M.length; i++) {
                System.out.println("M[" + i + "]= ");
                M[i] = sc.nextInt();
            }
            for (int j = 0; j < M.length; j++) {
                if (M[j] > max) {
                    max = M[j];
                    index = j + 1;
                }
            }
            System.out.println("Mảng M:" + Arrays.toString(M) + " với giá trị lớn nhất của nó là:" + max + " và vị trí của nó là:" + index);
        }
        else {
            System.out.println(" Chiều dài mảng k thể vượt quá 20 ");
        }
    }
}
