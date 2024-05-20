package Buoi5.Fan;

public class Fan {
    private final int Slow = 1 ;
    private final int Medium = 2 ;
    private final int Fast = 3 ;

    private int speed = 1;
    private boolean on = false;
    private double radius = 7; // Bán kính quạt
    private String color = "Silver";
    public Fan() {

    }
    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    Fan(String color, int speed, boolean on, double radius ) {
        this.speed = speed;
        this.color = color;
        this.on = on;
        this.radius = radius;
    }
    public String toString() {
        if(this.isOn()) {
            return "Speed: " + speed + " , Color: " + color + " , Radius: " + radius + " Fan is on";
        }
        else {
            return "Speed: " + speed + " , Color: " + color + " , Radius: " + radius + " Fan is off";
        }
    }
}
