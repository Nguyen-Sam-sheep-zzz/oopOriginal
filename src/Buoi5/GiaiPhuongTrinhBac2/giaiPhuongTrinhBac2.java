package Buoi5.GiaiPhuongTrinhBac2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class giaiPhuongTrinhBac2 {
    private double a, b, c, delta;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(delta));
    }

    public double getRoot2() {
        return (-b - Math.sqrt(delta));
    }
}
