package Buoi5;

public class baiTapTemperature {
    private static double C;

    baiTapTemperature(double C) {
        baiTapTemperature.C = C;
    }

    public static double getC() {
        return C;
    }

    public static double getF() {
        return (C * 9 / 5) + 32;
    }

    public static double getK() {
        return (C + 274.15);
    }

    public static void display() {
        System.out.println("Temperature to C : " + getC());
        System.out.println("Temperature C to K: " + getK());
        System.out.println("Temperature C to F: " + getF());
    }

    public static void main(String[] args) {
        baiTapTemperature temperature = new baiTapTemperature(25);
        temperature.display();
    }
}
