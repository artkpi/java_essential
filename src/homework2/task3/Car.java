package homework2.task3;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String colour;

    public Car(){   // конструктор по умолчанию
        this.age = 5;
        this.speed = 80.0;
        this.weight = 1000;
        this.colour = "red";
    }
    public Car(int age){
        this.age = age;
        this.speed = 100.0;
        this.weight = 1200;
        this.colour = "red";
    }
    public Car(int age, double speed){
        this.age = age;
        this.speed = speed;
        this.weight = 1000;
        this.colour = "white";
    }
    public Car(int age, double speed, int weight){
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.colour = "gray";
    }
    public Car(int age, double speed, int weight, String colour){
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
