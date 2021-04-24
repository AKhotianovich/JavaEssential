package Lesson8.Package3;

public class Calculator {
    public int value_a;
    public int value_b;

    public Calculator(int value_a, int value_b) {
        this.value_a = value_a;
        this.value_b = value_b;
    }

    int add(){
        return this.value_a + this.value_b;
    }

    int sub(){
        return this.value_a - this.value_b;
    }

    int mul(){
        return this.value_a * this.value_b;
    }

    double div(){
        try {
            return this.value_a / this.value_b;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
