package homework3.task2;

public class GoodPupil extends Pupil{
    @Override
    void study() {
        System.out.println("I am study good");
    }
    @Override
    void read() {
        System.out.println("I can read well");
    }
    @Override
    void write() {
        System.out.println("I can write well");
    }
    @Override
    void relax() {
        System.out.println("I am relax sometimes");
    }
}
