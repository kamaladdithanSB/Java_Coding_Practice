package Data_Structures.hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the no of students: ");
        int n = s.nextInt();
        s.nextLine();
        Map <Integer,String> m = new HashMap<>(n);
        for(int i=0;i<n;i++){
            System.out.println("enter the student role numbers of student"+(i+1)+":");
            int roll = s.nextInt();
            s.nextLine();
            System.out.println("enter the student name"+(i+1)+":");
            String name = s.nextLine();
            m.put(roll,name);
        }
        System.out.println("the student details are: "+m);
        System.out.println("enter the roll no of the student to search: ");
        int r = s.nextInt();
        s.nextLine();
        boolean result = m.containsKey(r);
        if(result==true){
            System.out.println("the student"+" "+r+" "+"is found");
        }
        else{
            System.out.println("the student is not found");
        }
        System.out.println("enter the student roll no to remove: ");
        int rmv = s.nextInt();
        s.nextLine();
        m.remove(rmv);
        System.out.println("after removing the student"+" "+rmv+" "+":"+m);
        s.close();
    }
    
}
