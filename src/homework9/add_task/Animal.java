package homework9.add_task;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public static void main(String[] args) {
        Animal a1 = new Animal("Barsik", 5, true);
        Animal a2 = new Animal("Barsik", 5, true);
        Animal a3 = new Animal("Tolik", 5, true);
        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.hashCode());
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", age: " + getAge() + ", Tail: " + isTail();
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() && isTail() == animal.isTail() && getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isTail());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTail() {
        return tail;
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }
}
