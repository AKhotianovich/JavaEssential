package Lesson3.Package1;

public class GoodPupil extends Pupil{
    public GoodPupil(String name, int age, int kurse) {
        super(name, age, kurse);
    }

    public GoodPupil(String name, int age) {
        super(name, age);
    }

    void view(){
        super.study();
        super.read();
        super.write();
    }

}
