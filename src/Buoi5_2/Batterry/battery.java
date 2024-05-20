package Buoi5_2.Batterry;

public class battery {
    int energy;

    battery(int energy) {
        this.energy = energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void decreaseEnergy() {
        energy--;
    }
}

class Lamp {
    boolean status;
    battery battery;

    Lamp(boolean status, battery battery) {
        this.status = status;
        this.battery = battery;
    }

    public void setBattery(battery battery) {
        this.battery = battery;
    }

    public int getBatteryInfo() {
        battery.decreaseEnergy();
        return battery.energy;
    }

    public void light() {
        System.out.println("Sáng");
        battery.decreaseEnergy();
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }
}
