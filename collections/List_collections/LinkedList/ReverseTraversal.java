package collections.List_collections.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;


public class ReverseTraversal {
    public static void main(String[] args) {
        //create linked list
        LinkedList <String> city = new LinkedList<>();

        //add elements
        city.add("chennai");
        city.add("delhi");
        city.add("mumbai");

        //print original elements
        System.out.println("orginal order: ");
        for(String citi:city){
            System.out.println(citi);
        }
        //use descendingiterator() method for reverse traversal
        System.out.println("\n Reverse order: ");
        ListIterator <Integer> itertor = city.ListIterator(city.size());
        while(iterator.hasPrevious()){
            System.out.println(itertor.previous());
        }

    }
    
}
