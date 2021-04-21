package homework8.task2;
import java.util.Arrays;
import java.util.Scanner;

public class Worker {
    String name;
    String profession;
    int year;

    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {

            System.out.println("Enter name, profession and year of the first worker: ");
            Worker worker1 = new Worker(in.next(), in.next(), in.nextInt());
            System.out.println("Enter name, profession and year of the second worker: ");
            Worker worker2 = new Worker(in.next(), in.next(), in.nextInt());
            System.out.println("Enter name, profession and year of the third worker: ");
            Worker worker3 = new Worker(in.next(), in.next(), in.nextInt());
            System.out.println("Enter name, profession and year of the fourth worker: ");
            Worker worker4 = new Worker(in.next(), in.next(), in.nextInt());
            System.out.println("Enter name, profession and year of the fifth worker: ");
            Worker worker5 = new Worker(in.next(), in.next(), in.nextInt());

            Worker[] workers = {worker1, worker2, worker3, worker4, worker5};
            Arrays.sort(workers);

            System.out.println("Enter the work experience: ");
            int experience = in.nextInt();
            for (Worker temp: workers) {
                int n = 2021 - temp.getYear();
                if(n==experience) {
                    System.out.println(temp.getName());
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error in format of the year");
        }
    }

    public Worker(String name, String profession, int year){
        this.name = name;
        this.profession = profession;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}

