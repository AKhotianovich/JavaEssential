package Lesson3.Package1;

public class Main {
    public static void main(String[] args) {
        BadPupil badPupil = new BadPupil("Alex", 12);
        badPupil.view();
        ExcelentPupil excelentPupil = new ExcelentPupil("Dima", 21, 3);
        excelentPupil.view();
        GoodPupil goodPupil = new GoodPupil("Polina", 20, 2);
        goodPupil.view();
        ExcelentPupil excelentPupil1 = new ExcelentPupil("Angelina", 13);
        excelentPupil1.view();
    }
}
