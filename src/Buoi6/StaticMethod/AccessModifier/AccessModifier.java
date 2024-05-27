package Buoi6.StaticMethod.AccessModifier;

import java.awt.*;

public class AccessModifier {
    static class Circle {
        private double radius = 1.0;
        private String Color = "red";

        Circle() {

        }

        Circle(double r , String Color) {
            radius = r;
            this.Color = Color;
        }

        protected double getRadius() {
            return radius;
        }

        protected double getArea() {
            return radius * radius * Math.PI;
        }
    }
}
