package Lesson3.Package1;

public class ExcelentPupil extends Pupil{

    public ExcelentPupil(String name, int age, int kurse) {
        super(name, age, kurse);
    }

    public ExcelentPupil(String name, int age) {
        super(name, age);
    }


    void view(){
        super.study();
        super.relax();
        super.read();
        super.write();
    }
}
