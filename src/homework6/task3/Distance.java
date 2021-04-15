package homework6.task3;

public class Distance {
    double distance = 160;
    void print() {
        System.out.println(Distance.Converter.kmToMetres(distance));
        System.out.println(Distance.Converter.kmToMile(distance));
    }
    public static class Converter {

        public static double kmToMile(double n) {
           return n/1.6;
        }

        public static double kmToMetres(double n) {
            return n*1000;
        }

    }

}
class Main {
    public static void main(String[] args) {
        Distance instance = new Distance();
        instance.print();
    }
}
