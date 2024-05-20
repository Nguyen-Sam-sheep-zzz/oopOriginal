package Buoi6.StaticMethod.method;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    static int[] mang1 = {1, 2, 2, 2, 2, 3, 3, 4, 6, 6, 7};

    public static void main(String[] args) {
        checkTrungMang(mang1);
    }

    public static boolean checkTrung(int a, int b) {
        return a == b;
    }

    public static void checkTrungMang(int[] mang1) {
        for (int i = 0; i < test.mang1.length; i++) {
            for (int j = i + 1; j < test.mang1.length; j++) {
                if (checkTrung(test.mang1[i], test.mang1[j])) {
                    System.out.println("so " + test.mang1[i] + " bi trung");
                    xoaPT(test.mang1, test.mang1[i]);
                }
            }
        }
    }
       public static void xoaPT(int[] b, int x) {
        mang1 = Arrays.copyOf(mang1, mang1.length - 1);
        for (int i = 0, k = 0; i < b.length; i++) {
            if (b[i] != x) {
                mang1[k] = b[i];
                k++;
            }
        }
    }
}


