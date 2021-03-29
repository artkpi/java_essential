package homework1.task2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        System.out.println("Enter first side: ");
        Scanner in = new Scanner(System.in);
        double side1 = in.nextDouble();
        System.out.println("Enter second side: ");
        double side2 = in.nextDouble();

        double area = areaCalculator(side1, side2);
        System.out.println("Area: " + area);
        double perimeter = perimeterCalculator(side1, side2);
        System.out.println("Perimeter: " + perimeter);

    }
    static double areaCalculator (double side1, double side2) {
        return side1*side2;
    }
    static double perimeterCalculator (double side1, double side2){
        return 2*(side1+side2);
    }
}
