package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2_themPhanTuVaoMang {
    public static void main(String[] args) {
        do {
            System.out.println("nhập số phần tử của mảng");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] M = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("M[" + i + "]= ");
                M[i] = sc.nextInt();
            }
            System.out.println("Nhập số cần thêm vào mảng ");
            int num = sc.nextInt();
            System.out.println("Nhập vị trí bạn muốn thêm ");
            int pos = sc.nextInt();
            int[] newM = new int[M.length + 1];
            for (int x = 0, y = 0; x < newM.length; x++) {
                if (x != pos - 1) {
                    newM[x] = M[y];
                    y++;
                } else {
                    newM[x] = num;
                }
            }
            System.out.println("mảng khi thêm số " + num + " vào vị trí " + pos + " là " + Arrays.toString(newM));
            System.out.println("----------------------------------------------------------------------------------");
        }
        while (true);
    }
}
