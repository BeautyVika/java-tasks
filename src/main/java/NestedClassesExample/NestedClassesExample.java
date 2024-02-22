package NestedClassesExample;

import lombok.Getter;

public class NestedClassesExample {
    public static void main (String[] args){
        Car.Engine c = new Car.Engine(256);

        Car car =new Car("red", 4 ,c);

        System.out.println(c);
        System.out.println(car);
    }
}

@Getter
class Car {
    private String color;
    private int doorCount;
    private Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    @Getter
    public static class Engine{
        private int hoursePower;

        public Engine(int hoursePower) {
            this.hoursePower = hoursePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hoursePower=" + hoursePower +
                    '}';
        }
    }
}