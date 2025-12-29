package Map;

import java.util.HashMap;
import java.util.Map;

public class basics {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("student1",1);
        m.put("student2",2);
        m.put("student3",3);

        System.out.println("Map elements: "+m);
    }
    
}
