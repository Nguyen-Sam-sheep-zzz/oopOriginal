package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5_timGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int d = sc.nextInt();
        int[] M = new int[d];
        for(int i = 0; i < M.length; i++ ) {
            System.out.println("M["+i+"]= ");
            M[i] = sc.nextInt();
        }
        System.out.println("Mảng của bạn là: M");
        System.out.println(Arrays.toString(M));
        int min = M[0];
        for ( int i = 0; i< M.length; i++){
            if (min > M[i]) {
                min = M[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng = " + min );
    }
}
