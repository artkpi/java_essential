package homework7.add_task;

public class Main {
    public static void main(String[] args) {
        Vehicles v1 = Vehicles.Truck;
        Vehicles v2 = Vehicles.Sedan;
        Vehicles v3 = Vehicles.Bus;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
enum Vehicles {
    Truck(50000) {
        public String getColor() {
        return "red";
    }
    },
    Sedan(7000) {
        public String getColor() {
            return "black";
        }
    },
    Bus(30000) {
        public String getColor() {
            return "blue";
        }
    };

    int price;
    String color;

    Vehicles (int price) {
        this.price = price;
    }
    public String toString() {
        return "Vehicle " + super.toString() + " is " + getColor() + " and has price - " + getPrice();
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
