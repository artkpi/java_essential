package homework3.add_task;

public class ColourBook extends Printer{
    String red = "\u001B[31m";
    @Override
    void print(String value) {
        System.out.println(red + value);
    }
}
