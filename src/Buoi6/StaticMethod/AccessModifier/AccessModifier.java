package Buoi6.StaticMethod.AccessModifier;

public class AccessModifier {
    static class Circle {
        private double radius = 1.0;
        private String Color = "red";

        Circle() {

        }

        Circle(double r) {
            radius = r;
        }

        protected double getRadius() {
            return radius;
        }

        protected double getArea() {
            return radius * radius * Math.PI;
        }
    }
}
