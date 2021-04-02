package homework3.add_task;

public class Printer {
    void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Printer book = new ColourBook(); // приведение типа
        book.print("red book");
    }
}
