package Buoi5_2.TomAndJerry;
public class tomAndJerry {

}

class Mouse {
    String name;
    int weight;
    double speed;
    boolean life;

    Mouse(String name, int weigth, double speed, boolean life) {
        this.name = name;
        this.weight = weigth;
        this.speed = speed;
        this.life = life;
    }

    public void speak() {
        if(life) {
            System.out.println(" oi oi oi ");
        }
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}

class Cat {
    String name;
    int weight;
    double maxSpeed;

    Cat(String name,int weight, double maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public void Speak() {
        System.out.println(" meo meo ");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void catchMouse(Mouse mouse) {
        if (mouse.life && (maxSpeed > mouse.speed)) {
            System.out.println("Méo");
            System.out.println("chít..");
            System.out.println(getName() + " bắt dc " + mouse.getName());
            System.out.println("Tom sau khi bắt dc " + mouse.getName() + " " + ++weight);
            mouse.life = false;
        } else {
            System.out.println(mouse.getName() + " chạy thoát ");
        }
    }
}