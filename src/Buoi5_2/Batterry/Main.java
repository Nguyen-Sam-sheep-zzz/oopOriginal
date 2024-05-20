package Buoi5_2.Batterry;

public class Main {
    public static void main(String[] args) {
        battery battery1 = new battery(100);
        battery battery2 = new battery(50);
        Lamp Lamp1 = new Lamp(true, battery1);
        Lamp1.light();
        System.out.println(Lamp1.getBatteryInfo());
        Lamp1.setBattery(battery2);
        System.out.println(Lamp1.getBatteryInfo());
    }
}
