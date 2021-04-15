package homework6.add_task;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();

        System.out.println("The addition of this numbers is: " + addition(number1, number2));
        System.out.println("The subtraction of this numbers is: " + subtraction(number1, number2));
        System.out.println("The multiplication of this numbers is: " + multiplication(number1, number2));
        System.out.println("The division of this numbers is: " + division(number1, number2));

    }
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }public static int multiplication(int a, int b) {
        return a * b;
    }public static double division(int a, int b) {
        return (double)a / b;
    }
}
