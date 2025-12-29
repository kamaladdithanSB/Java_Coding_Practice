package collections.Set_collections;

import java.util.HashSet;
import java.util.Iterator;

public class basic {public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("java");
    hs.add("java");//jvm simply ignores duplicate value
    hs.add("programming");

    Iterator<String> itr = hs.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }


}
    
}
