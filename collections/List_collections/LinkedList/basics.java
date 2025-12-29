package collections.List_collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class basics {
    public static void main(String[] args) {
        List <String> city = new LinkedList<>();
        city.add("chennai");
        city.add("delhi");
        city.add("mumbai");

        city.add(1,"pune");
        city.remove("delhi");
        for(String citi:city){
            System.out.println(citi);
        }
    }
    
}
