package homework3.task3;

public class Car extends Vehicle{
    int price = 1500000;
    int speed = 250;
    int age = 5;

    @Override
    void aboutVehicle() {
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Age: " + age);
    }
}
