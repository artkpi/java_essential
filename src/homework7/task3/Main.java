package homework7.task3;

public class Main {
    public static void main(String[] args) {
        Animals a1 = Animals.Cat;
        System.out.println(a1);
    }
}
enum Animals {
    Cat(5), Dog(7), Horse(12), Rabbit(1), Tiger(3);

    int age;

    Animals (int age) {
        this.age = age;
    }
    public String toString() {
        return "Animal " + super.toString() + " is " + getAge() + " years old";
    }

    public int getAge() {
        return age;
    }
}