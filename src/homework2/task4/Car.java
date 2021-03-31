package homework2.task4;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String colour;

    public Car(){   // конструктор по умолчанию
        this(5, 80.0, 1000,"red");
    }
    public Car(int age){
        this(age,100.0,1200, "blue");
    }
    public Car(int age, double speed){
        this(age, speed,1000,"white");
    }
    public Car(int age, double speed, int weight){
        this(age, speed, weight, "gray");
    }
    public Car(int age, double speed, int weight, String colour){
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
