package Lesson10.Package3;

public class MyClass <T>{
    public T factoryMethod(T element){
        System.out.println(element.getClass());
        return element;
    }

    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        MyClass<Integer> integerMyClass = new MyClass<>();

        System.out.println(myClass.factoryMethod("String"));
        System.out.println(integerMyClass.factoryMethod(1));
    }
}
