package Lesson3.Package1;

public class Pupil extends ClassRoom{

    public Pupil(String name, int age, int kurse) {
        super(name, age, kurse);
    }

    public Pupil(String name, int age) {
        super(name, age);
    }

    void study(){
        System.out.println("I'm " + name + " Age: " + age + " Kurse: " + kurse);
    }

    void  read(){
        System.out.println("I'm read");
    }

    void write(){
        System.out.println("I'm write");
    }

    void relax(){
        System.out.println("I'm relax");
    }
}
