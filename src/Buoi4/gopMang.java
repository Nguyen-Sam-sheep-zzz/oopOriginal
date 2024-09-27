package Buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class gopMang {

    private static int[] M3;

    public static void main(String[] args) {
        do {
            System.out.println("Nhập phần tử của mảng 1");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int[] M1 = new int[a];
            for (int i = 0; i < M1.length; i++) {
                System.out.print(" M[" + i + "]= ");
                M1[i] = sc.nextInt();
            }
            System.out.println("Nhập phần tử của mảng 2");
            int b = sc.nextInt();
            int[] M2 = new int[b];
            for (int i = 0; i < M2.length; i++) {
                System.out.print(" M2[" + i + "]= ");
                M2[i] = sc.nextInt();
            }
            gopMang(M1, M2);
            display(M3);
        }
        while (true);
    }

    public static void gopMang(int[] M1, int[] M2) {
        M3 = new int[M1.length + M2.length];
        int pos = 0;
        for (int element : M1) {
            M3[pos] = element;
            pos++;
        }
        for (int element : M2) {
            M3[pos] = element;
            pos++;
        }
    }

    public static void display(int[] M3) {
        System.out.println("Mảng sau khi gộp là : " + Arrays.toString(M3));
        System.out.println("--------------------------------------------------");
    }
}

