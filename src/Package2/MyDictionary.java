package Package2;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {
    Map<TKey, TValue> dictionary = new HashMap<TKey, TValue>();

    public Map<TKey, TValue> getDictionary(){
        return dictionary;
    }

    public void addDictionary(TKey key, TValue value){
        dictionary.put(key, value);
    }

    public TValue indexOf(TKey key){
        return dictionary.get(key);
    }

    public int getSize(){
        return dictionary.size();
    }

    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.addDictionary(1, "One");
        myDictionary.addDictionary(2, "Two");
        myDictionary.addDictionary(3, "Three");

        System.out.println(myDictionary.getDictionary());
        System.out.println("Key 2: " + myDictionary.indexOf(2));
        System.out.println("Size: " + myDictionary.getSize());

    }

}
