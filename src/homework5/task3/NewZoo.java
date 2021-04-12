package homework5.task3;

import homework5.task2.Zoo;

import java.util.ArrayList;


public class NewZoo {
    public static void main(String[] args) {

        Zoo s = new Zoo();
        ArrayList<String> newZoo;
        newZoo = s.getAnimals();
        newZoo.remove(7);
        newZoo.remove(5);
        newZoo.remove(3);

        System.out.println(newZoo.size());
    }
}
