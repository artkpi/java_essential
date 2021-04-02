package homework3.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();

        Vehicle [] vehicles = {car, plane, ship};
        for (Vehicle temp: vehicles) {
            temp.aboutVehicle();
            System.out.println();

        }
    }
}
