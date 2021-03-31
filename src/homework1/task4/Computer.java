package homework1.task4;

public class Computer {
    public static void main(String[] args) {
        Object[] computers = new Object[5];

        Computer iMac = new Computer();
        Computer Dell = new Computer();
        Computer Samsung = new Computer();
        Computer Lenovo = new Computer();
        Computer Asus = new Computer();

        for (int i = 0; i < computers.length; i++) {
        computers[i] = new Computer();
        }
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

    }
}
