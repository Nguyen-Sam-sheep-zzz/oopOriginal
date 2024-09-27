package Buoi5_2;
public class tomAndJerry {
    public static void main(String[] args) {
        Mouse Jerry = new Mouse("Jerry",2,5,true);
        Mouse Mickey = new Mouse("Mickey",2,11,true);
        Cat Tom = new Cat ("Tom",5,9);
        System.out.println("Trọng lượng Tom ban đầu " + Tom.getWeight());
        Tom.catchMouse(Jerry);
        Tom.catchMouse(Mickey);
    }
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