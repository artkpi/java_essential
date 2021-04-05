package homework4.task3;

public class Player implements Playable, Recodable{
    public static void main(String[] args) {
        Player record = new Player();
        record.play();
        record.pause();
        record.record();
        record.stop();
    }

    @Override
    public void play() {
        System.out.println("Play record.");
    }

    @Override
    public void record() {
        System.out.println("Record record.");
    }

    @Override
    public void pause() {
        System.out.println("Pause record.");
    }

    @Override
    public void stop() {
        System.out.println("Stop record.");
    }
}
