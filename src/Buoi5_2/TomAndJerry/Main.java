package Buoi5_2.TomAndJerry;

public class Main {
    public static void main(String[] args) {
        Mouse Jerry = new Mouse("Jerry",2,5,true);
        Mouse Mickey = new Mouse("Mickey",2,11,true);
        Cat Tom = new Cat ("Tom",5,9);
        System.out.println("Trọng lượng Tom ban đầu " + Tom.getWeight());
        Tom.catchMouse(Jerry);
        Tom.catchMouse(Mickey);
    }
}
