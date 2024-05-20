package Buoi5_2.AdamEva;

public class adamEva {

}

class Apple {
    int weight = 10;

    Apple() {

    }

    public void decrease() {
        weight--;
    }

    public boolean isEmpty() {
        if (weight == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getWeight() {
        return weight;
    }
}

class Human {
    String name;
    boolean gender; // male == true
    int weight;

    Human(String name, Boolean gender, int weight) {
        this.gender = gender;
        this.weight = weight;
        this.name = name;
    }
    public void displayGender() {
        if(gender) {
            System.out.println("Giới tính nam ");
        }
        else {
            System.out.println("Giới tính nữ ");
        }
    }


    public boolean isMale() {
        return true;
    }
    public boolean isFemale() {
        return false;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean checkApple(Apple apple) {
        return apple.isEmpty();
    }
    public void eat(Apple apple) {
        if (apple.weight > 0) {
            this.weight++;
            apple.decrease();
        }
    }

    public void say(String string) {
        System.out.println(name + " " + string);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}