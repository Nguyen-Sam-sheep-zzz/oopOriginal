package Buoi3;

import java.util.Scanner;

public class TH2_timGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Nhân", "Khánh", "Dũng", "Phanh", "Sâm"};
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tên sinh viên để tìm Gtri ");
        String inputname = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputname)) {
                System.out.println("Vị trí của " + inputname + " là: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(" k tìm thấy " +inputname+ " trong mảng ");
        }
    }
}
