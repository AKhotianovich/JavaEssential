package Package1;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<T>();

    public List<T> getList(){
        return list;
    }

    public void add(T t){
        list.add(t);
    }

    public int indexOfMeth(T t){
        return list.indexOf(t);
    }

    public int countList(){
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> List = new MyList<>();
        List.add("First");
        List.add("Last");

        System.out.println(List.getList());
        System.out.println("Index = " + List.indexOfMeth("Last"));
        System.out.println("Count = " + List.countList());
    }
}
