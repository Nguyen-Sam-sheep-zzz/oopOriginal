package Buoi6.StaticMethod.Car;

import java.util.SplittableRandom;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name,String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}

