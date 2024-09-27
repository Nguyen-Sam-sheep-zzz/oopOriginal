package Buoi4;

public class test {
    int a;
    test(int a) {
        this.a = a;
    }
    public static void main(String[] args) {
        test n1 = new test(3);
        test n2 = new test(5);
        System.out.println("n1: " + n1.a + ", n2: " + n2.a);
        swap(n1,n2);
        System.out.println("n1: " + n1.a + ", n2: " + n2.a);
    }
    public static void swap(test n1, test n2) {
        int x = n1.a;
        n1.a = n2.a;
        n2.a = x;
    }
}

