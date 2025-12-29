package collections.Set_collections;

import java.util.HashSet;

public class CRUDoperation {
    public static void main(String[] args) {
        
    
    HashSet<String>fruits = new HashSet<>();

    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("watermelon");

    System.out.println("fruits in hashset: "+fruits);
    boolean containsbanana = fruits.contains("banana");
    System.out.println("contains banana: "+containsbanana);
    fruits.remove("orange");
    System.out.println("fruits after removing orange: "+fruits);
    boolean isthisEmpty = fruits.isEmpty();
    System.out.println("is the hashset empty: "+isthisEmpty);

    
}
}