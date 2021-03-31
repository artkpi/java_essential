package homework2.task4;

import homework2.task3.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(5);
        Car car2 = new Car(5, 75.5);
        Car car3 = new Car(5, 75.5, 1500);
        Car car4 = new Car(5, 75.5, 1300, "black");
    }
}
