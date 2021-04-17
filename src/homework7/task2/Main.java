package homework7.task2;


interface ErrorPrinter {
    void printError (String s);
}
public class Main {
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        ErrorPrinter instance = new ErrorPrinter() {

            @Override
            public void printError(String s) {
                System.out.println(ANSI_RED + s);
            }

        };
        instance.printError("Text");
    }
}

