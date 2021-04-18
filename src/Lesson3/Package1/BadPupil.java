package Lesson3.Package1;

public class BadPupil extends Pupil{

    public BadPupil(String name, int age, int kurse) {
        super(name, age, kurse);
    }

    public BadPupil(String name, int age) {
        super(name, age);
    }


    void view(){
        super.study();
        super.relax();

    }
}
