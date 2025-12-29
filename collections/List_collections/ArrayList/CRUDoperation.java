package collections.List_collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CRUDoperation {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<>();//using arraylist class itself instead if list interface and with string generic class
        //adding elements
        fruits.add("apple");//using add method
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("watermelon");
        System.out.println("the original list of fruits is: "+fruits);

        //accessing elements
        System.out.println("element at index 2 is: "+fruits.get(2));
        //we are using arrayname.get(index value) method

        //modify elements
        fruits.set(2, "pineapple");
        System.out.println("the modified list of fruits is: "+fruits);

        //insert at specific index
        fruits.add(3,"muskmelon");
        System.out.println("after the insertion operation: "+fruits);

        //remove by index
        fruits.remove(3);
        System.out.println("after remove by index operation: "+fruits);

        //remove by value
        fruits.remove("apple");
        System.out.println("after remove by value operation: "+fruits);

        //check if the element exists
        System.out.println("contains kixi?: "+fruits.contains("kiwi"));

        //get the size of arraylist
        System.out.println("the size of the arraylist is : "+fruits.size());

        //sortthe arraylist
        Collections.sort(fruits);
        System.out.println("the sorted list is: "+fruits);

        //iterate using for each
        System.out.println("interating using for each: ");
        for(String fruit:fruits){
        System.out.println(fruit);
        }
        //iterate using iterator method
        System.out.println("iterating using iterator method: ");
        Iterator <String> it = fruits.iterator();//creating a interface reference where name of interface is iterator
        ///fruits is a object
        /// object of arraylist class
        /// and this is calling iterator mathod from its top most parent...beauty of inheritance!!!
        while(it.hasNext()){//hasnext() is used to check whether this object is havong value or not
            //return true
            //moves next
        System.out.println(it.next());//next() is doing two things
        //next() method is moving pointer to next object and prints the current obuject
        }
        //clear all elements
        fruits.clear();
        System.out.println("after clearing: "+fruits);

        //check if empty
        System.out.println("is the arraylist empty?: "+fruits.isEmpty());


    }
    
}
