package Lesson8.Package1;

public class Worker {
    public String fio;
    public String dol;
    public String year;

    public Worker(String fio, String dol, String year) {
        this.fio = fio;
        this.dol = dol;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Fio: " + this.fio + " Dol: " + this.dol + " Year: " + this.year;
     }


}
