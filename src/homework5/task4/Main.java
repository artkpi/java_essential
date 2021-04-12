package homework5.task4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        System.out.println(numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer n = iterator.next() + 1;

            newNumbers.add(n);
        }
        System.out.println(newNumbers);

    }
}
