package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3_gopMang {
    public static void main(String[] args) {
        System.out.println("Nhập phần tử của mảng 1");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] M1 = new int[a];
        for (int i = 0; i < M1.length; i++) {
            System.out.println(" M[" + i + "]= ");
            M1[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử của mảng 2");
        int b = sc.nextInt();
        int[] M2 = new int[b];
        for (int i = 0; i < M2.length; i++) {
            System.out.println(" M2[" + i + "]= ");
            M2[i] = sc.nextInt();
        }
        int[] M3 = new int[M1.length + M2.length];
        int pos = 0;
        for (int element : M1) {
            M3[pos] = element;
            pos++;
        }
        for (int element : M2) {
            M3[pos] = element;
            pos++;
        }
        System.out.println("Mảng sau khi gộp là : ");
        System.out.println(Arrays.toString(M3));

    }
}
