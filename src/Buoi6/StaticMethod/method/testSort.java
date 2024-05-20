package Buoi6.StaticMethod.method;

import java.util.Arrays;

public class testSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 3, 2, 6, 8};

    }
    public void sortM (int [] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

