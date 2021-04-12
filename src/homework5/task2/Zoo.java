package homework5.task2;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> animals = new ArrayList<>();
    {
        animals.add(0, "Wolf");
        animals.add(1, "Bear");
        animals.add(2, "Elephant");
        animals.add(3, "Fox");
        animals.add(4, "Rabbit");
        animals.add(5, "Owl");
        animals.add(6, "Tiger");
        animals.add(7, "Giraffe");
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public static void main(String[] args) {
        Zoo s = new Zoo();
        System.out.println(s.animals);
    }
}
