package homework3.task3;

public class Plane extends Vehicle {
    int height = 10000;
    int numberOfPassengers = 450;
    int price = 5000000;
    int speed = 1250;
    int age = 10;

    @Override
    void aboutVehicle() {
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Number of passengers: " + numberOfPassengers);
    }
}
