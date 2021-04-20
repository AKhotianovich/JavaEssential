package Lesson7.Package1;

public enum Animal {
    MOUSE(2), HUMAN(13), CAT(5), CHICKEN(6), SHEEP(10);


    int year;
    Animal(int year){
        this.year = year;
    }


    public String getYear(){
        return this.name() + " " + this.year + " years old";
    }
}
