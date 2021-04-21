package homework8.add_task;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();
        System.out.println("Enter the math operation: ");
        String mathOperation = in.next();
        switch (mathOperation) {
            case ("+"):
                System.out.println("The addition of this numbers is: " + add(number1, number2));
                break;
            case ("-"):
                System.out.println("The subtraction of this numbers is: " + sub(number1, number2));
                break;
            case ("*"):
                System.out.println("The multiplication of this numbers is: " + mul(number1, number2));
                break;
            case ("/"):
                try {
                    System.out.println("The division of this numbers is: " + div(number1, number2));
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }


        }

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}

