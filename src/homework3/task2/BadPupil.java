package homework3.task2;

public class BadPupil extends Pupil{
    @Override
    void study() {
        System.out.println("I am study bad");
    }
    @Override
    void read() {
        System.out.println("I cann`t read very well");
    }
    @Override
    void write() {
        System.out.println("I cann`t write very well");
    }
    @Override
    void relax() {
        System.out.println("I always relax");
    }
}
