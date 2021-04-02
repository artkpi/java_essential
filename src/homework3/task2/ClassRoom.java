package homework3.task2;

public class ClassRoom {
    public ClassRoom (Pupil pupil) {

    }
    public static void main(String[] args) {

        Pupil pupil1 = new BadPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new ExcelentPupil();
        Pupil pupil4 = new ExcelentPupil();

        Pupil [] array = {pupil1, pupil2, pupil3, pupil4};

        for (Pupil temp: array) {
            temp.study();
            temp.read();
            temp.write();
            temp.relax();
            System.out.println();
        }

    }
}