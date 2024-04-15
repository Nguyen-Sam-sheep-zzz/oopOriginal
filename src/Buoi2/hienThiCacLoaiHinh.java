package Buoi2;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("2. tam giác vuông cạnh vuông bottom left ");
        System.out.println("3. tam giác vuông cạnh vuông top left ");
        System.out.println("4. tam giác vuông cạnh vuông top right ");
        System.out.println("5. tam giác vuông cạnh vuông bottom right ");
        System.out.println("6. tam giác cân ");
        while (choice != 0) {
            System.out.println("------------------------------------------------");
            System.out.println("Hãy điền số vào đây:");
            choice = sc.nextInt();
            String space = " ";
            String draw = "";
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(space);
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int x = 4; x >= i; x--) {
                            System.out.print("   ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 5; i >= 1; i--) {
                        for (int x = 4; x >= i; x--) {
                            System.out.print("   ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 1; i <= 7; i++) {
                        for (int x = 4; x >= i; x--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("hãy nhập số trong menu trên :)))");

            }

        }

    }
}
