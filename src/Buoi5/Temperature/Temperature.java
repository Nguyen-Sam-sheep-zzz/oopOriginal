package Buoi5.Temperature;

import java.util.Scanner;

public class Temperature {
    private double C;

    Temperature(double C) {
        this.C = C;
    }

    public double getC() {
        return C;
    }

    public double CtoF() {
        return (C * 9 / 5) + 32;
    }

    public double CtoK() {
        return (C + 274.15);
    }

    public void displayAll() {
        System.out.println("Temperature to C : " + getC());
        System.out.println("Temperature C to K: " + CtoK());
        System.out.println("Temperature C to F: " + CtoF());
    }

    public void displayC() {
        System.out.println("Temperature to C : " + getC());
    }

    public void displayK() {
        System.out.println("Temperature C to K: " + CtoK());
    }

    public  void displayF() {
        System.out.println("Temperature C to F: " + CtoF());
    }
}


