package homework5.add_task;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Teacher1");
        teachers.add("Teacher2");
        teachers.add("Teacher3");
        teachers.add("Teacher4");
        teachers.add("Teacher5");

        System.out.println("Index the best teacher is: " + teachers.indexOf("Teacher2"));
        System.out.println("Index the worst teacher is: " + teachers.indexOf("Teacher4"));
        System.out.println(teachers);
    }
}
