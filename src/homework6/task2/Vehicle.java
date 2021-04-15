package homework6.task2;

public class Vehicle {
    private class Wheel {
        String color = "Green";
    }
    private class Door {
        String color = "Red";
    }

    void printWheelColor() {
        Wheel instance = new Wheel();
        System.out.println(instance.color);
    }
    void printDoorColor () {
        Door instance = new Door();
        System.out.println(instance.color);
    }

}
