package Buoi3;

import java.util.Arrays;

public class TH1_daoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int[] mang1 = {1, 2, 3, 4, 5, 6};
        for (int i = 0, j = mang1.length - 1; i < j; i++, j--) {
            int temp = mang1[i];
            mang1[i] = mang1[j];
            mang1[j] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(mang1));
    }
}
