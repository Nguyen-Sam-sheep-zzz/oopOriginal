package Buoi4;

public class thucHanh2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        min(arr);
    }
    public static void min (int [] a) {
        int min = a[0];
        for (int i : a) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
